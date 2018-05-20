package exerciciosXML.calcados;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonPropertyOrder({"esporte", "marca", "preco"})
@JacksonXmlRootElement(localName = "tenis")
//@JsonIgnoreProperties(ignoreUnknown = true)
public class Tenis extends calcado{
	private String esporte;

	public String getEsporte() {
		return esporte;
	}

	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}
	
	public Tenis(String esporte, String marca, float preco) {
		super(marca, preco);
		this.esporte = esporte;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "------------------- \n"
				+ "Tenis \n"
				+ "Esporte: " + esporte + " \n"
				+ "Marca: " + getMarca() + " \n"
				+ "Preco: R$" + getPreco() + " \n";
	}
	
	public Tenis() {
		super();
	}
}
