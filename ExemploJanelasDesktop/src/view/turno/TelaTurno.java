package view.turno;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JComponent;

import view.TelaTemplate;

public class TelaTurno extends TelaTemplate<EstadoTurno> {
	private final String NOTURNO = "Noturno";
	public TelaTurno() {

		Label lb1 = new Label("Turno:");
		this.add(lb1);
		final JRadioButton rb1 = new JRadioButton("Matutino");
		JRadioButton rb2 = new JRadioButton("Vespertino");
		JRadioButton rb3 = new JRadioButton(NOTURNO);
		ButtonGroup bg = new ButtonGroup();
		JRadioButton[] turnos = {rb1, rb2, rb3 };
		
		JRadioButton rb4 = new JRadioButton("Período antes das 22h");
		JRadioButton rb5 = new JRadioButton("Período após as 22h");
		JRadioButton[] adicional = {rb4 , rb5 };
		JLabel lb2 = new JLabel("Adicional noturno:");
		JComponent[] itensAdicionalNoturno = {rb4 , rb5 , lb2};
		
		class ActionListenerControlaTurno implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				String opcaoSelecionada="";
				for(JRadioButton rb: turnos ) {
					if(rb.isSelected()) {
						opcaoSelecionada = rb.getText();
						break;
					}
				}
				boolean exibe = opcaoSelecionada.equals(NOTURNO) ? true : false;
				for(JComponent item : itensAdicionalNoturno) {
					item.setVisible(exibe);
				}
								
			}
		}
		
	ActionListenerControlaTurno listener = new ActionListenerControlaTurno();
		
	for(JRadioButton rb: turnos) {
		bg.add(rb);
		this.add(rb);
		rb.addActionListener(listener);
	}
	bg = new ButtonGroup();
	this.add(lb2);
	for(JRadioButton rb: adicional) {
		bg.add(rb);
		this.add(rb);
	}
	//rb3.setSelected(true);// valor default
	for(JComponent item : itensAdicionalNoturno) {
		item.setVisible(false);
	}
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
