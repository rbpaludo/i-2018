package exerciciosXML.paciente;

import java.util.Arrays;

public class Individuo {
	private int surrogateKey;
	private Comunicacao[] comunicacoes;
	private Nome[] nomes;
	private DadoDemografico dadoDemografico;
	private Endereco[] enderecos;
	private Vinculo[] vinculos;
	private Identificador[] identificadores;
	
	public Individuo() {
		super();
	}
	
	public int getSurrogateKey() {
		return surrogateKey;
	}
	public void setSurrogateKey(int surrogateKey) {
		this.surrogateKey = surrogateKey;
	}
	
	public Comunicacao[] getComunicacoes() {
		return comunicacoes;
	}
	public void setComunicacoes(Comunicacao[] comunicacoes) {
		this.comunicacoes = comunicacoes;
	}
	
	public Nome[] getNomes() {
		return nomes;
	}
	public void setNomes(Nome[] nomes) {
		this.nomes = nomes;
	}
	
	public DadoDemografico getDadoDemografico() {
		return dadoDemografico;
	}
	public void setDadoDemografico(DadoDemografico dadoDemografico) {
		this.dadoDemografico = dadoDemografico;
	}
	
	public Endereco[] getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(Endereco[] enderecos) {
		this.enderecos = enderecos;
	}
	
	public Vinculo[] getVinculos() {
		return vinculos;
	}
	public void setVinculos(Vinculo[] vinculos) {
		this.vinculos = vinculos;
	}
	
	public Identificador[] getIdentificadores() {
		return identificadores;
	}
	public void setIdentificadores(Identificador[] identificadores) {
		this.identificadores = identificadores;
	}
	
	public Individuo(int surrogateKey, Nome[] nomes, Identificador[] identificadores) {
		super();
		this.surrogateKey = surrogateKey;
		this.nomes = nomes;
		this.identificadores = identificadores;
	}
	
	@Override
	public String toString() {
		String output = "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
				+ "Individuo Código: " + surrogateKey + "\n - Nomes: \n" + Arrays.toString(nomes) + "\n - Identificadores: \n"
				+ Arrays.toString(identificadores);
		
		if(this.comunicacoes != null) {
			output += "\n - Comunicacoes: \n" + Arrays.toString(comunicacoes);
		}
		
		if(this.dadoDemografico != null) {
			output += "\n - Dado Demografico: \n" + dadoDemografico.toString(); 
		}
		
		if(this.enderecos != null) {
			output += "\n - Enderecos: \n" + Arrays.toString(enderecos);
		}
		
		if(this.vinculos != null) {
			output += "\n - Vinculos: \n" + Arrays.toString(vinculos);
		}
		
		output += "\n\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*";
		return output;
	}
}
