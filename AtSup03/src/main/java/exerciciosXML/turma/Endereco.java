package exerciciosXML.turma;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonPropertyOrder({"CEP", "logradouro", "num", "complemento"})
@JacksonXmlRootElement(localName = "sapato")
public class Endereco {
	private String CEP;
	private String logradouro;
	private int num;
	private String complemento;
	
	public String getCEP() {
		return CEP;
	}
	
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Endereco(String cEP, String logradouro, int num, String complemento) {
		super();
		CEP = cEP;
		this.logradouro = logradouro;
		this.num = num;
		this.complemento = complemento;
	}

	@Override
	public String toString() {
		return "Endereco [CEP=" + CEP + ", logradouro=" + logradouro + ", num=" + num + ", complemento=" + complemento
				+ "]";
	}

	public Endereco() {
		super();
	}
	
}
