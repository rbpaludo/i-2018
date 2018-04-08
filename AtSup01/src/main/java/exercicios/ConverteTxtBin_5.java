package exercicios;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConverteTxtBin_5 {

	public static void main(String[] args) throws IOException {
		Path arquivoTxt = Paths.get(args[0]);
		Charset utf8 = Charset.forName("UTF-8");				
				
			FileOutputStream out = new FileOutputStream(args[1]);
			
			byte[] data, numero = new byte[4];
			
			BufferedReader br = Files.newBufferedReader(arquivoTxt, utf8);
			String linha;
			
			while((linha = br.readLine()) != null) {
				data = linha.getBytes("UTF-8");
				numero = toBytes(data.length);
				out.write(numero);
				out.write(data);
			}
			br.close();
			out.write(0xFF);
			out.close();
	}
	
	private static byte[] toBytes(int i)
	{
		byte[] result = new byte[4];

		result[0] = (byte) (i >> 24);
		result[1] = (byte) (i >> 16);
		result[2] = (byte) (i >> 8);
		result[3] = (byte) (i /*>> 0*/);

		return result;
	}

}

