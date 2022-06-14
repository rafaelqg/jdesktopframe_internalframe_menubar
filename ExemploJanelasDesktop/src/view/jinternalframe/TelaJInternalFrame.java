package view.jinternalframe;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

import Controler.Main;

import javax.swing.JComponent;
import view.EstadoTelaAnaliseRisco;
import view.EstadoTelaBhaskara;
import view.TelaAnaliseRisco;
import view.TelaBhaskara;
import view.TelaTemplate;
import view.automovel.EstadoTelaAutomovel;
import view.automovel.TelaAutomovel;
import view.turno.EstadoTurno;
import view.turno.TelaTurno;

public class TelaJInternalFrame extends TelaTemplate<EstadoTelaJInternalFrame> {
	private JInternalFrame in;
	public TelaJInternalFrame() {
		in = this;// new JInternalFrame("My Internal Frame - Title");
		in.setTitle("Menu");
		//JFrame in= new JFrame("Meu JFrame");
		FlowLayout layoutIn = new FlowLayout();
		in.setLayout(layoutIn);
		JButton b1 = new JButton("Baskahra");
		JButton b2 = new JButton("Automóvel");
		JButton b3 = new JButton("Análise de risco");
		JButton b4 = new JButton("Turno");
		TelaJInternalFrame objetoFrame = this;
		b1.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaBhaskara<EstadoTelaBhaskara> tela = objetoFrame.getEstado().getTelaBaskaha() == null ?
						new TelaBhaskara<EstadoTelaBhaskara>():
						objetoFrame.getEstado().getTelaBaskaha() ;
				if(tela.isClosed()) {
					tela = new TelaBhaskara<EstadoTelaBhaskara>();
					objetoFrame.getEstado().setTelaBaskaha(null);
				}
				if(objetoFrame.getEstado().getTelaBaskaha() == null ) {		
					objetoFrame.getEstado().setTelaBaskaha(tela);
					tela.setEstado(new EstadoTelaBhaskara());
					atualizaPropriedadesInternalFrame(tela);
					Main.getPainel().add(tela);
				}
				tela.setVisible(true);		
			}
		});
		
		b2.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
					TelaAutomovel tela = objetoFrame.getEstado().getTelaAutomovel() == null ?
						new TelaAutomovel():
						objetoFrame.getEstado().getTelaAutomovel();
					
				if(tela.isClosed()) {
					tela = new TelaAutomovel();
					objetoFrame.getEstado().setTelaAutomovel(null);
				}
				if(objetoFrame.getEstado().getTelaAutomovel() == null ) {		
					objetoFrame.getEstado().setTelaAutomovel(tela);
					tela.setEstado(new EstadoTelaAutomovel());
					atualizaPropriedadesInternalFrame(tela);
					Main.getPainel().add(tela);
				}
				tela.setVisible(true);	
			}
		});
		
		b3.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaAnaliseRisco<EstadoTelaAnaliseRisco> tela = objetoFrame.getEstado().getTelaAnaliseRisco() == null ?
						new TelaAnaliseRisco<EstadoTelaAnaliseRisco>():
						objetoFrame.getEstado().getTelaAnaliseRisco();
					
				if(tela.isClosed()) {
					tela = new TelaAnaliseRisco<EstadoTelaAnaliseRisco>();
					objetoFrame.getEstado().setTelaAnaliseRisco(null);
				}
				if(objetoFrame.getEstado().getTelaAnaliseRisco() == null ) {		
					objetoFrame.getEstado().setTelaAnaliseRisco(tela);
					tela.setEstado(new EstadoTelaAnaliseRisco());
					atualizaPropriedadesInternalFrame(tela);
					Main.getPainel().add(tela);
				}
				tela.setVisible(true);
			}
		});
		
		b4.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaTurno tela = objetoFrame.getEstado().getTelaTurno() == null ?
						new TelaTurno():
						objetoFrame.getEstado().getTelaTurno();
					
				if(tela.isClosed()) {
					tela = new TelaTurno();
					objetoFrame.getEstado().setTelaTurno(null);
				}
				if(objetoFrame.getEstado().getTelaTurno() == null ) {		
					objetoFrame.getEstado().setTelaTurno(tela);
					tela.setEstado(new EstadoTurno());
					atualizaPropriedadesInternalFrame(tela);
					Main.getPainel().add(tela);
				}
				tela.setVisible(true);	
				
			}
		});
		
		in.add(b1);
		in.add(b2);
		in.add(b3);
		in.add(b4);
		in.setClosable(false);
		in.setResizable(false);
		in.setIconifiable(false);
		in.setMaximizable(false);
		in.show();
		//this.add(in);
		this.setSize(new Dimension(400, 200));
	}
	

	@Override
	protected void lerEstado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void atualizaEstado() {
		// TODO Auto-generated method stub
		
	}

	private void atualizaPropriedadesInternalFrame(JInternalFrame in) {
		in.setMaximizable(false);
		in.setResizable(false);
		in.setClosable(true);
		in.setIconifiable(true);
	}
}
