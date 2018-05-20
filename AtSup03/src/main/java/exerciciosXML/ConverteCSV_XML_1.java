package exerciciosXML;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class ConverteCSV_XML_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String separaPor = ";";
		String data;
		String xmlData = "<alunos>\n";
		
		while((data = br.readLine()) != null) {
			
			String[] nomeEmail = data.split(separaPor);
			
			xmlData += "<aluno>\n";
			xmlData += "<nome>" + nomeEmail[0] + "</nome>\n";
			xmlData += "<email>" + nomeEmail[1] + "</email>\n";
			xmlData += "</aluno>\n";
		}
		
		xmlData += "</alunos>";
		
		FileOutputStream fos = new FileOutputStream(args[0].substring(0, args[0].length() - 3) + "xml");
		
		fos.write(xmlData.getBytes());

		br.close();
		fos.close();
	}
}
