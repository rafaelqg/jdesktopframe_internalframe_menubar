package Controler;


import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.NumericShaper;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import view.EstadoTelaAnaliseRisco;
import view.EstadoTelaBhaskara;
import view.TelaAnaliseRisco;
import view.TelaBhaskara;
import view.automovel.TelaAutomovel;
import view.jinternalframe.EstadoTelaJInternalFrame;
import view.jinternalframe.TelaJInternalFrame;
import view.turno.EstadoTurno;
import view.turno.TelaTurno;
import view.automovel.EstadoTelaAutomovel;
public class Main {
	private static JDesktopPane painel = new JDesktopPane(); 
	private static EstadoTelaJInternalFrame estado = new EstadoTelaJInternalFrame();
	public static JDesktopPane getPainel() {
		return painel;
	}

	public static void setPainel(JDesktopPane painel) {
		Main.painel = painel;
	}

	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			//UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		/*
		 TelaJInternalFrame tif = new  TelaJInternalFrame();
		 tif.setEstado(new EstadoTelaJInternalFrame());
		 tif.exibe();
		  tif.setIconifiable(true);
		 tif.setMaximizable(true);
		 painel.add(tif);
		 */
		 JFrame principal = new JFrame("Tela Principal");
		 principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 painel.setBackground(Color.LIGHT_GRAY); 
		 principal.setContentPane(painel);
		
		 principal.setSize(new Dimension(880, 670));
		 
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		int frameWidth =  principal.getSize().width;
		int frameHeight =  principal.getSize().height;
		int locationX = (int)(width - frameWidth) / 2;
		int locationY = (int)(height - frameHeight) / 2;
		principal.setLocation(locationX, locationY);
		
		
		
		
		JMenuBar menuBar = new JMenuBar(); // Cria menu 
		JMenu menu = new JMenu("Ações"); 
		
		JMenuItem item = new JMenuItem("Baskahra"); // Cria itens dos menus
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaBhaskara<EstadoTelaBhaskara> tela = estado.getTelaBaskaha() == null ?
						new TelaBhaskara<EstadoTelaBhaskara>():
							estado.getTelaBaskaha() ;
				if(tela.isClosed()) {
					tela = new TelaBhaskara<EstadoTelaBhaskara>();
					estado.setTelaBaskaha(null);
				}
				if(estado.getTelaBaskaha() == null ) {		
					estado.setTelaBaskaha(tela);
					tela.setEstado(new EstadoTelaBhaskara());
					atualizaPropriedadesInternalFrame(tela);
					Main.getPainel().add(tela);
				}
				tela.setVisible(true);	
			}
		});
		menu.add(item);
		
		item = new JMenuItem("Automovel"); 
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaAutomovel tela = estado.getTelaAutomovel() == null ?
						new TelaAutomovel():
							estado.getTelaAutomovel();
					
				if(tela.isClosed()) {
					tela = new TelaAutomovel();
					estado.setTelaAutomovel(null);
				}
				if(estado.getTelaAutomovel() == null ) {		
					estado.setTelaAutomovel(tela);
					tela.setEstado(new EstadoTelaAutomovel());
					atualizaPropriedadesInternalFrame(tela);
					Main.getPainel().add(tela);
				}
				tela.setVisible(true);	
			}
		});
		menu.add(item);
		
		item = new JMenuItem("Análise de risco"); 
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaAnaliseRisco<EstadoTelaAnaliseRisco> tela = estado.getTelaAnaliseRisco() == null ?
						new TelaAnaliseRisco<EstadoTelaAnaliseRisco>():
						estado.getTelaAnaliseRisco();
					
				if(tela.isClosed()) {
					tela = new TelaAnaliseRisco<EstadoTelaAnaliseRisco>();
					estado.setTelaAnaliseRisco(null);
				}
				if(estado.getTelaAnaliseRisco() == null ) {		
					estado.setTelaAnaliseRisco(tela);
					tela.setEstado(new EstadoTelaAnaliseRisco());
					atualizaPropriedadesInternalFrame(tela);
					Main.getPainel().add(tela);
				}
				tela.setVisible(true);
			}
		});
		menu.add(item);
		
		item = new JMenuItem("Turno"); 
		
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				TelaTurno tela = Main.estado.getTelaTurno() == null ?
						new TelaTurno():
							estado.getTelaTurno();
					
				if(tela.isClosed()) {
					tela = new TelaTurno();
					estado.setTelaTurno(null);
				}
				if(estado.getTelaTurno() == null ) {		
					estado.setTelaTurno(tela);
					tela.setEstado(new EstadoTurno());
					atualizaPropriedadesInternalFrame(tela);
					Main.getPainel().add(tela);
				}
				tela.setVisible(true);	
			}
		});
		menu.add(item);
		
		/*
		
		JMenu ajuda = new JMenu("Ajuda"); 
		JMenuItem sobre = new JMenuItem("Sobre");
		ajuda.add(sobre);
		menuBar.add(ajuda);
		JMenu novo = new JMenu("Novo");
		menu.add(novo);
		JMenuItem item = new JMenuItem("Documento"); // Cria itens dos menus
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			// code to create new form
			}
		});
		novo.add(item);
		JMenuItem diretorio = new JMenuItem("Pasta");
		novo.add(diretorio);
		 */
		//Cria segundo item
		
		item = new JMenuItem("Sair");
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			System.exit(1);
			}
		});
		menu.add(item);
		
		menuBar.add(menu);
		principal.setJMenuBar(menuBar);
		
		
		principal.setVisible(true);
		
		
		/*
		JFrame frame = new JFrame();
		frame.setPreferredSize(new Dimension(500,500));
		JDesktopPane painel = new JDesktopPane(); 
		painel.setBackground(Color.LIGHT_GRAY); 
		frame.setContentPane(painel);
		
		painel.add( createInternalFrame() );
		painel.add( createInternalFrame() );
		painel.add( createInternalFrame() );
		frame.setVisible(true);
		*/
	}
	
	private static JInternalFrame createInternalFrame() {
		JInternalFrame in = new JInternalFrame("My Internal Frame - Title");
		FlowLayout layoutIn = new FlowLayout();
		in.setLayout(layoutIn);
		JButton b = new JButton("Salvar");
		JButton b1 = new JButton("Excluir");
		JButton b2 = new JButton("Duplicar");
		in.add(b);
		in.add(b1);
		in.add(b2);
		//in.remo
		in.setClosable(true);
		in.setResizable(false);
		//in.setMaximizable(true);
		in.setIconifiable(true);
		in.setPreferredSize(new Dimension(300, 300));
		in.setVisible(true);
		in.pack();
		return in;
	}
	
	private static void atualizaPropriedadesInternalFrame(JInternalFrame in) {
		in.setMaximizable(false);
		in.setResizable(false);
		in.setClosable(true);
		in.setIconifiable(true);
	}
	
}
