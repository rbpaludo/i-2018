package exerciciosXML.paciente;

public class LinhaEndereco {
	private String ordem;
	private int linha;
	
	public String getOrdem() {
		return ordem;
	}
	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}
	
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	
	public LinhaEndereco(String ordem, int linha) {
		super();
		this.ordem = ordem;
		this.linha = linha;
	}
	
	@Override
	public String toString() {
		return "\n ----LinhaEndereco [ordem=" + ordem + ", linha=" + linha + "]";
	}
}
