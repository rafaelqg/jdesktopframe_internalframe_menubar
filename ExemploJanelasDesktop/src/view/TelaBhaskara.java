package view;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import Controler.CalculadoraBaskahra;

public class TelaBhaskara<E extends EstadoTelaBhaskara> extends TelaTemplate<E>{
	private JTextField tfA;
	private JTextField tfB;
	private JTextField tfC;
	private Label valorXLinha;
	private Label valorXDuasLinhas;
	
	public TelaBhaskara() {
		super();
		ArrayList<TelaBhaskara> list = new ArrayList<TelaBhaskara>();
		this.setTitle("Baskahra");
		this.setResizable(false);
		this.setLocation(300, 300);
		tfA = addJTextField(this);
		Label lX2 = addLabel("x^2 + ", this);
		tfB = addJTextField(this);
		Label lX1 = addLabel("x + ", this);
		tfC = addJTextField(this);
		addLabel("x'=", this);
		valorXLinha = addLabel("", this);
		valorXLinha.setPreferredSize(new Dimension(45,30));
		addLabel("x''=", this);
		valorXDuasLinhas = addLabel("", this);
		valorXDuasLinhas.setPreferredSize(new Dimension(45,30));
		JButton bt = new JButton();
		bt.setText("Calcular");
		bt.setPreferredSize(new Dimension(200,30));
		bt.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {

				try {
					lerEstado();
					CalculadoraBaskahra cb= new CalculadoraBaskahra();
					double[] saida = cb.calcula(estado.getA(), estado.getB(), estado.getC());
					estado.setX1(saida[0]);
					estado.setX2(saida[1]);
					atualizaEstado();
				}catch(NumberFormatException e) {
					e.printStackTrace();
				}
					
			}
		}
		);
		
	
		this.add(bt);
	}
	
	private Label addLabel(String texto, Container parent) {
		Label l = new Label();
		l.setText(texto);
		parent.add(l);
		return l;
	}
	
	private JTextField addJTextField(Container parent) {
		JTextField tf = new JTextField();
		tf.setPreferredSize(new Dimension(30, 20));
		parent.add(tf);
		return tf;
	}
	

	
	protected void lerEstado() {
		String a = tfA.getText();
		String b = tfB.getText();
		String c = tfC.getText();
		String x1 = valorXLinha.getText();
		String x2 = valorXDuasLinhas.getText();
		try {
			double aNum = Double.parseDouble(a);
			double bNum = Double.parseDouble(b);
			double cNum = Double.parseDouble(c);
			double x1Num = x1.equals("")?0:Double.parseDouble(x1);
			double x2Num = x2.equals("")?0:Double.parseDouble(x2);
			estado.setA(aNum);
			estado.setB(bNum);
			estado.setC(cNum);
			estado.setX1(x1Num);
			estado.setX2(x2Num);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
	}
	
	public void atualizaEstado() {
		tfA.setText(String.valueOf(estado.getA()));
		tfB.setText(String.valueOf(estado.getB()));
		tfC.setText(String.valueOf(estado.getC()));
		valorXLinha.setText(String.valueOf(estado.getX1()));
		valorXDuasLinhas.setText(String.valueOf(estado.getX2()));
	}
	
}
