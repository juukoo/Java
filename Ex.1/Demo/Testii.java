package Demo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Testii extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea_1;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Testii frame = new Testii();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Testii() {
		setTitle("Notepad--");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 509);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New");
		mnFile.add(mntmNewMenuItem);
		
		JMenuItem mntmFile = new JMenuItem("Open...");
		mntmFile.addActionListener(new ActionListener() { 
		 	public void actionPerformed(ActionEvent arg0) { 
			JFileChooser valintaikkuna = new JFileChooser();
			valintaikkuna.showOpenDialog(null);
			String rivi = "";
			String uusiTiedosto = valintaikkuna.getSelectedFile().getAbsolutePath();
			valintaikkuna.setApproveButtonText("Avaa tiedosto");
			valintaikkuna.setDialogTitle("Tiedoston valinta");
			
			try{
				Scanner lukija = null;
				
				File tiedosto = new File(uusiTiedosto);
				
				lukija = new Scanner(tiedosto);
				
				while (lukija.hasNextLine()){
					rivi += lukija.nextLine()+"\n";
					System.out.println(rivi);
				}
			}catch (FileNotFoundException e){
				System.out.println("Tiedostoa ei löydy.");
			}
			
			textArea_1.setText(rivi);
			
			}
		});
		mnFile.add(mntmFile);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e){
				
				//Tallennus ikkunan koodi
				JFileChooser valintaikkuna = new JFileChooser();
				valintaikkuna.showSaveDialog(null);
				String uusiTiedosto = valintaikkuna.getSelectedFile().getAbsolutePath();
				System.out.println("Kirjoitettava tiedosto: "+uusiTiedosto);
				
				try {
					
				//Tallenuksen tekevä koodi
				PrintWriter write = new PrintWriter(uusiTiedosto);
				String sisalto = textArea_1.getText();
				
				write.println(sisalto);
				
				//Vakiotoimet siivotaan PrinWriter ja suljetaan se
				write.flush();
				write.close();
				
				//Virheen nappaus ja ilmoitus virheen tapahtumasta käyttäjälle
				}catch (Exception e_1){
					System.out.println("Tiedoston tallenus epäonnistui, yritä uudelleen");
					e_1.printStackTrace();
				}
			}
		});
		mnFile.add(mntmSave);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Save As...");
		mnFile.add(mntmNewMenuItem_1);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JMenuItem mntmPrint = new JMenuItem("Print...");
		mnFile.add(mntmPrint);
		
		JSeparator separator_1 = new JSeparator();
		mnFile.add(separator_1);
		
		
		
		JMenuItem mntmQuit = new JMenuItem("Exit");
		mntmQuit.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
	
				System.exit(0);
			}	
		
		});
		
		mnFile.add(mntmQuit);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmFind = new JMenuItem("Find...");
		mntmFind.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				
				String sisalto = textArea_1.getText();
				sisalto = sisalto.toLowerCase();
				String haettava = "auto";
				int indeksi = sisalto.indexOf(haettava);
				System.out.println("Indeksi: "+indeksi);
				
				textArea_1.setSelectionColor(Color.GREEN);
				
				textArea_1.setSelectionStart(indeksi);
				textArea_1.setSelectionEnd(indeksi + haettava.length());
				
			}
		});
		mnEdit.add(mntmFind);
		
		JMenu mnFormat = new JMenu("Format");
		menuBar.add(mnFormat);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane(); 
	 	contentPane.add(scrollPane); 
	 	
	 	textArea_1 = new JTextArea(); 
	 	textArea_1.setColumns(10); 
	 	scrollPane.setViewportView(textArea_1); 
		
	}

	
	public JTextArea getTextArea() {
		return textArea_1;
	}
}
