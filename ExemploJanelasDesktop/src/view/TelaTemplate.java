package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public abstract class TelaTemplate<E> extends JInternalFrame{
	protected E estado;
	
	public TelaTemplate() {
		FlowLayout fl = new FlowLayout();
		this.setLayout(fl);
		this.setSize(new Dimension(320, 340));
	}
	
	public void setEstado(E e) {
		this.estado = e;
	}
	
	public E getEstado() {
		return this.estado ;
	}
	
	protected abstract void lerEstado();
	
	protected  abstract void atualizaEstado();
	
	public void exibe() {
		System.out.println("Implementação da super classe");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		int frameWidth = this.getSize().width;
		int frameHeight = this.getSize().height;
		this.setSize(frameWidth, frameHeight);
		int locationX = (int)(width - frameWidth) / 2;
		int locationY = (int)(height - frameHeight) / 2;
		this.setLocation(locationX, locationY);

		this.setVisible(true);
	}
	
	public void exibe(String titulo) {
		System.out.println("Implementação da super classe");
		this.setTitle(titulo);
		this.exibe();
	}
}
