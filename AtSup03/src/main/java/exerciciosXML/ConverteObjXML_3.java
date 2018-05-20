package exerciciosXML;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.xml.stream.XMLStreamException;

import org.codehaus.stax2.XMLOutputFactory2;
import org.codehaus.stax2.XMLStreamWriter2;

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
		
		try {
			serializaTurma(turma);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void serializaTurma(Turma turma) throws IOException, XMLStreamException {
		
		XmlMapper objMapper = new XmlMapper();
		
		String data = objMapper.writeValueAsString(turma);
		
		Files.write(Paths.get("turmaXML.xml"), data.getBytes(), StandardOpenOption.APPEND);
	}
}
