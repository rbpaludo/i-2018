package exerciciosXML;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.xml.stream.XMLStreamException;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import exerciciosXML.paciente.Individuo;
import exerciciosXML.turma.Turma;

public class SerializacaoPaciente_4 {
	public static void main(String[] args) {
		
	}
	
public static void serializaPaciente(Individuo individuo) throws IOException, XMLStreamException {
		
		XmlMapper objMapper = new XmlMapper();
		
		String data = objMapper.writeValueAsString(individuo);
		
		Files.write(Paths.get("pacienteXML.xml"), data.getBytes(), StandardOpenOption.APPEND);
	}
}
