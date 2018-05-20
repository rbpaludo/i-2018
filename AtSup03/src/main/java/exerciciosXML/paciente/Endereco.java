package exerciciosXML.paciente;

public class Endereco {
	private int surrogateKey;
	private String bairro;
	private String distrito;
	private int codMunicipio;
	private String estado;
	private String CEP;
	private String caixaPostal;
	private String pais;
	private String tipo;
	private LinhaEndereco[] linhaEndereco;
	private Data dataInicio;
	private Data dataFim;
	
	public int getSurrogateKey() {
		return surrogateKey;
	}
	public void setSurrogateKey(int surrogateKey) {
		this.surrogateKey = surrogateKey;
	}
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	
	public int getCodMunicipio() {
		return codMunicipio;
	}
	public void setCodMunicipio(int codMunicipio) {
		this.codMunicipio = codMunicipio;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	
	public String getCaixaPostal() {
		return caixaPostal;
	}
	public void setCaixaPostal(String caixaPostal) {
		this.caixaPostal = caixaPostal;
	}
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public LinhaEndereco[] getLinhaEndereco() {
		return linhaEndereco;
	}
	public void setLinhaEndereco(LinhaEndereco[] linhaEndereco) {
		this.linhaEndereco = linhaEndereco;
	}
	
	public Data getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Data dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public Data getDataFim() {
		return dataFim;
	}
	public void setDataFim(Data dataFim) {
		this.dataFim = dataFim;
	}
	
	public Endereco(int surrogateKey, String bairro, String distrito, int codMunicipio, String estado, String cEP,
			String caixaPostal, String pais, String tipo) {
		super();
		this.surrogateKey = surrogateKey;
		this.bairro = bairro;
		this.distrito = distrito;
		this.codMunicipio = codMunicipio;
		this.estado = estado;
		this.CEP = cEP;
		this.caixaPostal = caixaPostal;
		this.pais = pais;
		this.tipo = tipo;
	}
}
