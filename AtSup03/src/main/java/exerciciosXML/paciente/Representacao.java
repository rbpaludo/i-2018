package exerciciosXML.paciente;

public class Representacao {
	private String utilizacao;
	private String alternativa;
	
	public String getUtilizacao() {
		return utilizacao;
	}
	public void setUtilizacao(String utilizacao) {
		this.utilizacao = utilizacao;
	}
	
	public String getAlternativa() {
		return alternativa;
	}
	public void setAlternativa(String alternativa) {
		this.alternativa = alternativa;
	}
	
	public Representacao(String utilizacao, String alternativa) {
		super();
		this.utilizacao = utilizacao;
		this.alternativa = alternativa;
	}
}
