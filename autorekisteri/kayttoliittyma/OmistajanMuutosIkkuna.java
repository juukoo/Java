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
public class OmistajanMuutosIkkuna extends JFrame {

    private JLabel reknroselite = new JLabel("Rekisterinumero:");
    private JLabel omistajaselite = new JLabel("Omistaja:");
    private JTextField reknro = new JTextField(7);
    private JComboBox omistaja;
    private JTextArea omistajantiedot = new JTextArea(3, 20);
    private JScrollPane rullaavaOmistaja = new JScrollPane(omistajantiedot);
    private JButton tallenna = new JButton("Tallenna");
    private JPanel pohjapaneeli = new JPanel();
    private TietovarastonRajapinta kanta;

    public OmistajanMuutosIkkuna(TietovarastonRajapinta kanta) {
        this.kanta = kanta;
        try{
          omistaja = new JComboBox(kanta.haeKaikkiHenkilot().toArray());
          paivitaOmistaja();
          omistaja.setEditable(false);
          asetteleKomponentit();
        }
        catch(Tietovarastovirhe vt) {
             JOptionPane.showMessageDialog(this, vt.getMessage(), "virhe",JOptionPane.ERROR_MESSAGE);
             this.dispose();
        }
    }
    private void asetteleKomponentit() {
        GroupLayout asettelu = new GroupLayout(pohjapaneeli);
        pohjapaneeli.setLayout(asettelu);

        asettelu.setAutoCreateGaps(true);
        asettelu.setAutoCreateContainerGaps(true);

        //X-suunta
        GroupLayout.ParallelGroup seliteX = asettelu.createParallelGroup();
        seliteX.addComponent(reknroselite);
        seliteX.addComponent(omistajaselite);

        GroupLayout.ParallelGroup kentatX = asettelu.createParallelGroup();
        kentatX.addComponent(reknro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE);
        kentatX.addComponent(omistaja, TRAILING);//GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE);
        kentatX.addComponent(rullaavaOmistaja, TRAILING);//,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE);

        GroupLayout.SequentialGroup ylaX = asettelu.createSequentialGroup();
        ylaX.addGroup(seliteX);
        ylaX.addGroup(kentatX);

        GroupLayout.ParallelGroup pohjaX = asettelu.createParallelGroup();
        pohjaX.addGroup(ylaX);
        pohjaX.addComponent(tallenna, TRAILING);

        asettelu.linkSize(SwingConstants.HORIZONTAL, omistaja, rullaavaOmistaja);
        asettelu.setHorizontalGroup(pohjaX);

        //Y-suunta
        GroupLayout.ParallelGroup reknroriviY = asettelu.createParallelGroup();
        reknroriviY.addComponent(reknroselite);
        reknroriviY.addComponent(reknro);

        GroupLayout.ParallelGroup omistajariviY = asettelu.createParallelGroup();
        omistajariviY.addComponent(omistajaselite);
        omistajariviY.addComponent(omistaja);

        GroupLayout.SequentialGroup pohjaY = asettelu.createSequentialGroup();
        pohjaY.addGroup(reknroriviY);
        pohjaY.addGroup(omistajariviY);
        pohjaY.addComponent(rullaavaOmistaja);
        pohjaY.addComponent(tallenna);

        asettelu.setVerticalGroup(pohjaY);
        this.add(pohjapaneeli);
        this.setLocation(100, 100);
        this.setTitle("Auton omistajan vaihtaminen");
        this.pack();
        this.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                suoritaLopputoimet();
            }
        });
        tallenna.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                vaihdaOmistajaKantaan();
            }
        });

        omistaja.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                paivitaOmistaja();

            }
        });
    }

    private void suoritaLopputoimet() {
        this.dispose();
    }

    private void paivitaOmistaja() {
        Henkilo valittuHenkilo = (Henkilo) omistaja.getSelectedItem();
        omistajantiedot.setText("");
        omistajantiedot.append(valittuHenkilo.toString());
        omistajantiedot.append("\nHETU: ");
        omistajantiedot.append(valittuHenkilo.getHenkilotunnus());
    }

    private void vaihdaOmistajaKantaan() {
        try {
            Henkilo autonOmistaja = (Henkilo) omistaja.getSelectedItem();
            Auto apuAuto=kanta.haeAuto(reknro.getText());
            if(apuAuto!=null){
              kanta.vaihdaOmistaja(apuAuto, autonOmistaja);
              suoritaLopputoimet();
            }
            else {
              JOptionPane.showMessageDialog(this, "Autoa ei löydy", "Virhe", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch (Tietovarastovirhe vt) {
            JOptionPane.showMessageDialog(this, vt.getMessage(), "Virhe", JOptionPane.ERROR_MESSAGE);
        }
    }
}
