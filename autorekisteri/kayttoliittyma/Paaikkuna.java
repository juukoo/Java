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
public class Paaikkuna extends JFrame {

    private JButton lisaaAuto = new JButton("Auton lisääminen");
    private JButton lisaaHenkilo = new JButton("Henkilön lisääminen");
    private JButton vaihdaOmistaja = new JButton("Omistajan vaihtaminen");
    private JButton haeKaikkiAutot = new JButton("Hae kaikki autot");
    private JButton sulje = new JButton("Sulje");
    private JPanel pohjapaneeli = new JPanel();
    private TietovarastonRajapinta kanta = new TietovarastonRajapinta();

    public Paaikkuna() {
        GroupLayout asettelu = new GroupLayout(pohjapaneeli);
        pohjapaneeli.setLayout(asettelu);

        asettelu.setAutoCreateGaps(true);
        asettelu.setAutoCreateContainerGaps(true);

        //X-suunta
        GroupLayout.ParallelGroup pohjaX = asettelu.createParallelGroup();
        pohjaX.addComponent(lisaaAuto);
        pohjaX.addComponent(lisaaHenkilo);
        pohjaX.addComponent(vaihdaOmistaja);
        pohjaX.addComponent(haeKaikkiAutot);
        pohjaX.addComponent(sulje, TRAILING);

        asettelu.linkSize( lisaaAuto, lisaaHenkilo, vaihdaOmistaja, haeKaikkiAutot);
        asettelu.setHorizontalGroup(pohjaX);

        //Y-suunta
        GroupLayout.SequentialGroup pohjaY = asettelu.createSequentialGroup();
        pohjaY.addComponent(lisaaAuto);
        pohjaY.addComponent(lisaaHenkilo);
        pohjaY.addComponent(vaihdaOmistaja);
        pohjaY.addComponent(haeKaikkiAutot);
        pohjaY.addComponent(sulje);

        asettelu.setVerticalGroup(pohjaY);
        this.add(pohjapaneeli);
        this.setLocation(100, 100);
        this.setTitle("Autorekisteri");
        this.pack();

        this.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                suoritaLopputoimet();
            }
        });

        lisaaAuto.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                autonLisays();
            }
        });
        lisaaHenkilo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                henkilonLisays();
            }
        });
        vaihdaOmistaja.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                omistajanVaihtaminen();
            }
        });
        haeKaikkiAutot.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                autojenHaku();
            }
        });
       
        sulje.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                suoritaLopputoimet();
            }
        });
    }

    private void autonLisays() {
        new AutonSyottoIkkuna(kanta);
    }

    private void henkilonLisays() {
        new HenkilonSyottoIkkuna(kanta).setVisible(true);
    }

    private void omistajanVaihtaminen() {
        new OmistajanMuutosIkkuna(kanta).setVisible(true);
    }

    private void autojenHaku() {
        JTextArea kaikkiAutot = new JTextArea(10, 20);
        try {
          for (Auto alkio : kanta.haeKaikkiAutot()) {
              kaikkiAutot.append(alkio.toString());
              kaikkiAutot.append("\n");
          }
          JOptionPane.showMessageDialog(this, new JScrollPane(kaikkiAutot), 
                "Kaikki autot", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Tietovarastovirhe vt) {
          JOptionPane.showMessageDialog(this, vt.getMessage(), "virhe",JOptionPane.ERROR_MESSAGE);
        }
    }

    private void suoritaLopputoimet() {
        System.exit(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Paaikkuna().setVisible(true);
            }
        });
    }
}
