package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComboBox;

import Controler.ControlerAnaliseRisco;
import model.Impacto;
import model.Probabilidade;

public class TelaAnaliseRisco<E extends EstadoTelaAnaliseRisco>  extends TelaTemplate<EstadoTelaAnaliseRisco> {
	private ControlerAnaliseRisco controler = new ControlerAnaliseRisco();
	public TelaAnaliseRisco() {
		super();
		Label l1 = new Label();
		l1.setText("Probabilidade:");
		this.add(l1);
		JComboBox jcbProbabilidade = new JComboBox();
		ArrayList<Probabilidade> lista  = controler.getProbabilidades();
		for(Probabilidade p: lista) {
			jcbProbabilidade.addItem(p);
		}
		this.add(jcbProbabilidade);
		
		
		Label l2 = new Label();
		l2.setText("Impacto:");
		this.add(l2);
		JComboBox jcbImpacto = new JComboBox();
		ArrayList<Impacto> listaImp  = controler.getImpactos();
		for(Impacto i: listaImp) {
			jcbImpacto.addItem(i);
		}
		this.add(jcbImpacto);
		
		JButton bt = new JButton ();
		bt.setText("Calcular");
		
		
		this.add(bt);
		Label l3= new Label();
		l3.setText("Fator de impacto:");
		this.add(l3);
		
		bt.addMouseListener(new MouseAdapter() {	
			@Override
			public void mouseClicked(MouseEvent evt) {
				Impacto i= (Impacto)jcbImpacto.getSelectedItem();
				Probabilidade p = (Probabilidade)jcbProbabilidade.getSelectedItem();
				int valor = controler.calculaFatorExposicao(p, i);
				Color c = Color.BLACK;
				
				if(valor > 9) {
					c = Color.RED;
				}else if(valor < 3) {
					c = Color.BLUE;
				}
				l3.setText("Fator de impacto:"+ valor);
				l3.setForeground(c);
				
			}
		});
	}

	@Override
	protected void lerEstado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void atualizaEstado() {
		// TODO Auto-generated method stub
		
	}

}
