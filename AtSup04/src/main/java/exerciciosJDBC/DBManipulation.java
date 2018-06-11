package exerciciosJDBC;

import java.util.Date;

import exerciciosJDBC.paciente.Individuo;

public class DBManipulation {
	public Individuo consultaIndividuo(String nome, String nomeMae, Date dataNascimento, String sexo) {
		Individuo individuo = new Individuo();
		
		
		
		return individuo;
	}
	
	public boolean individuoExiste (String nome, String nomeMae, Date dataNascimento, String sexo) {
		return true;
	}
	
	public boolean updateIndividuo (Individuo individuo) {
		return true;
	}
	
	public boolean createIndividuo (Individuo individuo) {
		return true;
	}
}
