//IH 2009
//koodaus UTF-8


package kayttoliittyma;

import data.*;
import tietovarastot.*;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.GroupLayout.Alignment.*;

/**
 *
 * @author IH
 */
public class HenkilonSyottoIkkuna extends JFrame {

    private JLabel hetuselite = new JLabel("Henkilotunnus:");
    private JLabel etunimiselite = new JLabel("Etunimi:");
    private JLabel sukunimiselite = new JLabel("Sukunimi:");
    private JTextField hetu = new JTextField(7);
    private JTextField etunimi = new JTextField(15);
    private JTextField sukunimi = new JTextField(20);
    private JButton tallenna = new JButton("Tallenna");
    private JPanel pohjapaneeli = new JPanel();
    private TietovarastonRajapinta kanta;

    public HenkilonSyottoIkkuna(TietovarastonRajapinta kanta) {
        this.kanta = kanta;
        GroupLayout asettelu = new GroupLayout(pohjapaneeli);
        pohjapaneeli.setLayout(asettelu);

        asettelu.setAutoCreateGaps(true);
        asettelu.setAutoCreateContainerGaps(true);

        //X-suunta
        GroupLayout.ParallelGroup seliteX = asettelu.createParallelGroup();
        seliteX.addComponent(hetuselite);
        seliteX.addComponent(etunimiselite);
        seliteX.addComponent(sukunimiselite);

        GroupLayout.ParallelGroup kentatX = asettelu.createParallelGroup();
        kentatX.addComponent(hetu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE);
        kentatX.addComponent(etunimi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE);
        kentatX.addComponent(sukunimi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE);

        GroupLayout.SequentialGroup ylaX = asettelu.createSequentialGroup();
        ylaX.addGroup(seliteX);
        ylaX.addGroup(kentatX);

        GroupLayout.ParallelGroup pohjaX = asettelu.createParallelGroup();
        pohjaX.addGroup(ylaX);
        pohjaX.addComponent(tallenna, TRAILING);

        asettelu.setHorizontalGroup(pohjaX);

        //Y-suunta
        GroupLayout.ParallelGroup heturiviY = asettelu.createParallelGroup();
        heturiviY.addComponent(hetuselite);
        heturiviY.addComponent(hetu);

        GroupLayout.ParallelGroup enimiriviY = asettelu.createParallelGroup();
        enimiriviY.addComponent(etunimiselite);
        enimiriviY.addComponent(etunimi);

        GroupLayout.ParallelGroup snimiriviY = asettelu.createParallelGroup();
        snimiriviY.addComponent(sukunimiselite);
        snimiriviY.addComponent(sukunimi);

        GroupLayout.SequentialGroup pohjaY = asettelu.createSequentialGroup();
        pohjaY.addGroup(heturiviY);
        pohjaY.addGroup(enimiriviY);
        pohjaY.addGroup(snimiriviY);
        pohjaY.addComponent(tallenna);

        asettelu.setVerticalGroup(pohjaY);
        this.add(pohjapaneeli);
        this.setLocation(100, 100);
        this.setTitle("Henkilötietojen syöttö");
        this.pack();
        this.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                suoritaLopputoimet();
            }
        });
        tallenna.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                lisaaHenkiloKantaan();
            }
        });
    }

    private void suoritaLopputoimet() {
        this.dispose();
    }

    private void lisaaHenkiloKantaan() {
        try {
            kanta.lisaaHenkilo(new Henkilo(hetu.getText(), etunimi.getText(), sukunimi.getText()));
            suoritaLopputoimet();
        }
        catch (Tietovarastovirhe vt) {
            JOptionPane.showMessageDialog(this, vt.getMessage(), "Virhe", JOptionPane.ERROR_MESSAGE);
        }
    }
}
