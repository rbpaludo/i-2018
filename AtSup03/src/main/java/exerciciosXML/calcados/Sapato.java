package exerciciosXML.calcados;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonPropertyOrder({"cor", "marca", "preco"})
@JacksonXmlRootElement(localName = "sapato")
//@JsonIgnoreProperties(value = "")
public class Sapato extends calcado {
	
	private int[] cor;
	
	public int[] getCor() {
		return cor;
	}
	
	public void setCor(int[] cor) {
		this.cor = cor;
	}

	public Sapato(int[] cor, String marca, float preco) {
		super(marca, preco);
		this.cor = cor;
		// TODO Auto-generated constructor stub
	}
	
	public Sapato() {
		super();
	}

	@Override
	public String toString() {
		return "------------------- \n"
				+ "Sapato \n"
				+ "Cor: " + Arrays.toString(cor) + " \n"
				+ "Marca: " + getMarca() + " \n"
				+ "Preco: R$" + getPreco() + " \n";
	}
}
