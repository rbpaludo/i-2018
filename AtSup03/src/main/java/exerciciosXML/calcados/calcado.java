package exerciciosXML.calcados;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "calcados")
public class calcado {
	private String marca;
	private float preco;
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}

	public calcado(String marca, float preco) {
		super();
		this.marca = marca;
		this.preco = preco;
	}
	
	public calcado() {
		super();
	}
}
