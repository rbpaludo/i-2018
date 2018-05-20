package exerciciosXML;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.xml.stream.XMLStreamException;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import exerciciosXML.turma.Endereco;
import exerciciosXML.turma.Estudante;
import exerciciosXML.turma.Turma;

public class ConverteObjXML_3 {
	
	public static void main(String[] args) {
		Turma turma = new Turma();
		
		Endereco[] enderecos = new Endereco[] {
				new Endereco("123456-78", "Rua 37", 3737, "Casa azul"),
				new Endereco("987654-32", "Rua 24", 2424, "Casa amarela")
		};
		
		Estudante[] estudantes = new Estudante[] {
				new Estudante("Zezinho", enderecos[0]),
				new Estudante("Luizinho", enderecos[0]),
				new Estudante("Joaozinho", enderecos[1])
		};
		
		turma.setEstudantes(estudantes);
		turma.setDisciplina("Integração de Aplicações");
		
		System.out.println("Para economizar seu tempo, a turma a ser armazenada é a seguinte: \n" + turma.toString() + "\n\n");
		
		try {
			serializaTurma(turma);
		} catch (IOException e) {
			System.out.println("Houve um problema no processo de escrever o arquivo XML. É provável que o arquivo informado não exista");
		} catch (XMLStreamException e) {
			System.out.println("Houve um problema no processo de converter o objeto Turma para o texto XML.");
		}
	}
	
	public static void serializaTurma(Turma turma) throws IOException, XMLStreamException {
		
		XmlMapper objMapper = new XmlMapper();
		
		String data = objMapper.writeValueAsString(turma);
		
		Files.write(Paths.get("turmaXML.xml"), data.getBytes(), StandardOpenOption.APPEND);
	}
}
