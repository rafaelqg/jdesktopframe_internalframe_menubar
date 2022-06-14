package view.jinternalframe;

import javax.swing.JComponent;

import view.TelaAnaliseRisco;
import view.TelaBhaskara;
import view.TelaTemplate;
import view.automovel.TelaAutomovel;
import view.turno.TelaTurno;

public class EstadoTelaJInternalFrame {
	TelaBhaskara telaBaskaha;
	TelaAutomovel telaAutomovel;
	TelaTurno telaTurno;
	TelaAnaliseRisco telaAnaliseRisco;
	public TelaBhaskara getTelaBaskaha() {
		return telaBaskaha;
	}
	public void setTelaBaskaha(TelaBhaskara telaBaskaha) {
		this.telaBaskaha = telaBaskaha;
	}
	public TelaAutomovel getTelaAutomovel() {
		return telaAutomovel;
	}
	public void setTelaAutomovel(TelaAutomovel telaAutomovel) {
		this.telaAutomovel = telaAutomovel;
	}
	public TelaTurno estado() {
		return telaTurno;
	}
	public void setTelaTurno(TelaTurno telaTurno) {
		this.telaTurno = telaTurno;
	}
	public TelaAnaliseRisco getTelaAnaliseRisco() {
		return telaAnaliseRisco;
	}
	public void setTelaAnaliseRisco(TelaAnaliseRisco telaAnaliseRisco) {
		this.telaAnaliseRisco = telaAnaliseRisco;
	}
	public TelaTurno getTelaTurno() {
		return telaTurno;
	}
	
	
	

	
}
