package exerciciosXML.turma;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonPropertyOrder({"disciplina", "estudantes"})
@JacksonXmlRootElement(localName = "turma")
public class Turma {
	private String disciplina; 
	private Estudante[] estudantes;
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public Estudante[] getEstudantes() {
		return estudantes;
	}
	
	public void setEstudantes(Estudante[] estudantes) {
		this.estudantes = estudantes;
	}

	@Override
	public String toString() {
		return "Turma [disciplina=" + disciplina + ", estudantes=" + Arrays.toString(estudantes) + "]";
	}
}
