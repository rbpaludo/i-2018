package exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExibeTexto_3 {

	public static void main(String[] args) {
		Path arquivo = Paths.get(args[0]);
		Charset utf8 = Charset.forName("UTF-8");
		try {
			BufferedReader br = Files.newBufferedReader(arquivo, utf8);

			String linha;
			while((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
