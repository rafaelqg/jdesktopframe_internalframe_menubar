package view.automovel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;

import view.TelaTemplate;

public class TelaAutomovel extends TelaTemplate<EstadoTelaAutomovel>{
	
	class MeuTratamentoEvento implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			System.out.println("Meu tratamento de evento");
			
		}
		
	}
	
	public TelaAutomovel(){
		super();
		String[] opcionais = {
				"Ar Condicionado",
				"Air bag",
				"Sensor de estacionamento",
				"Blue tooth",
				"GPS",
				"ABS"
				};
		JCheckBox[] camposOpcionais = new JCheckBox[opcionais.length];
		byte i = 0;
		for(String opcional :  opcionais) {
			JCheckBox checkbox = new JCheckBox();
			camposOpcionais[i] = checkbox;
			checkbox.setText(opcional);
			this.add(checkbox);
			i++;
		}
		
		JButton bt = new JButton();
		bt.setText("Registra automóvel");
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				estado.setTemABS(camposOpcionais[5].isSelected());
				estado.setTemAirbag(camposOpcionais[1].isSelected());
				estado.setTemAr(camposOpcionais[0].isSelected());
				estado.setTemBlueTooth(camposOpcionais[3].isSelected());
				estado.setTemGPS(camposOpcionais[4].isSelected());
				estado.setTemSensor(camposOpcionais[2].isSelected());
				System.out.println(estado.toString());
			}
		});
		this.add(bt);
		/*
		checkbox.addItemListener(new MeuTratamentoEvento());
		
		checkbox.addItemListener(new ItemListener() {
		
			public void itemStateChanged(ItemEvent e) {
				System.out.println(checkbox.isSelected()
				? "Need special assistence"
				: "Do not need special assistence"
			);
		}
		});
		*/
		this.exibe();

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
