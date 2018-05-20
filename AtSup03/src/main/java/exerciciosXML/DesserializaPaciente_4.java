package exerciciosXML;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import exerciciosXML.paciente.Individuo;

public class DesserializaPaciente_4 {
	public static void main(String[] args) throws IOException, ParseException {
		Path arquivoXML = Paths.get(args[0]);
		BufferedReader br = Files.newBufferedReader(arquivoXML, Charset.forName("UTF-8"));
		XmlMapper objectMapper = new XmlMapper();
		StringBuilder builder = new StringBuilder();
		String data;

		while ((data = br.readLine()) != null) {
			builder.append(data);
		}

		Individuo individuo = objectMapper.readValue(builder.toString().getBytes(), Individuo.class);

		System.out.println("E aqui está o indivíduo, novamente, em sua forma normal, depois da desserialização: \n " + 
		individuo.toString());
	}
}
