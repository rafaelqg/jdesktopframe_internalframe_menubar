package view.automovel;

public class EstadoTelaAutomovel {
	private boolean temAr;
	private boolean temABS;
	private boolean temAirbag;
	private boolean temSensor;
	private boolean temBlueTooth;
	private boolean temGPS;

	public EstadoTelaAutomovel() {
		
	}

	public EstadoTelaAutomovel(boolean temAr, boolean temABS, boolean temAirbag, boolean temSensor,
			boolean temBlueTooth, boolean temGPS) {
		this.temAr = temAr;
		this.temABS = temABS;
		this.temAirbag = temAirbag;
		this.temSensor = temSensor;
		this.temBlueTooth = temBlueTooth;
		this.temGPS = temGPS;
	}

	public boolean isTemAr() {
		return temAr;
	}
	public void setTemAr(boolean temAr) {
		this.temAr = temAr;
	}
	public boolean isTemABS() {
		return temABS;
	}
	public void setTemABS(boolean temABS) {
		this.temABS = temABS;
	}
	public boolean isTemAirbag() {
		return temAirbag;
	}
	public void setTemAirbag(boolean temAirbag) {
		this.temAirbag = temAirbag;
	}
	public boolean isTemSensor() {
		return temSensor;
	}
	public void setTemSensor(boolean temSensor) {
		this.temSensor = temSensor;
	}
	public boolean isTemBlueTooth() {
		return temBlueTooth;
	}
	public void setTemBlueTooth(boolean temBlueTooth) {
		this.temBlueTooth = temBlueTooth;
	}
	public boolean isTemGPS() {
		return temGPS;
	}
	public void setTemGPS(boolean temGPS) {
		this.temGPS = temGPS;
	}

	@Override
	public String toString() {
		return "EstadoTelaAutomovel ["
				+ (temAr ? "temAr=" + temAr + "," : "")
				+ (temABS ? "temABS=" + temABS + "," : "")
				+ (temAirbag ? "temAirbag=" + temAirbag+", " : "")
				+ (temSensor ? "temSensor=" + temSensor + ", " : "")
				+ (temBlueTooth ? "temBlueTooth=" + temBlueTooth + "," : "")
				+ (temGPS ? "temGPS=" + temGPS  : "")
				+ "]";
	}
	
	
	
	
	
}
