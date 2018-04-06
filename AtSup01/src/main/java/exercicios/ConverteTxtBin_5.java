package exercicios;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConverteTxtBin_5 {

	public static void main(String[] args) {
		Path arquivoTxt = Paths.get(args[0]);
		Charset utf8 = Charset.forName("UTF-8");				
				
		try {
			FileOutputStream out = new FileOutputStream(args[1]);
			
			byte[] data;
			BufferedReader br = Files.newBufferedReader(arquivoTxt, utf8);
			String linha;
			
			while((linha = br.readLine()) != null) {
				data = linha.getBytes("UTF-8");
				out.write(data.length);
				out.write(data);
			}
			
			out.write(0xFF);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

