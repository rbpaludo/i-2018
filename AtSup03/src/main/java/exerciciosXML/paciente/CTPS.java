package exerciciosXML.paciente;

public class CTPS {
	private String serie;
	private String estado;
	
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public CTPS(String serie, String estado) {
		super();
		this.serie = serie;
		this.estado = estado;
	}
}
