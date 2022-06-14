package view.automovel;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;

public class MeuTratamentoEventoEspecial implements ItemListener{
	JCheckBox checkbox;
	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println("Olá....");				
	}
}