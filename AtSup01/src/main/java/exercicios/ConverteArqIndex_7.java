package exercicios;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConverteArqIndex_7 {

	public static void main(String[] args) throws IOException {
		Path arquivoTxt = Paths.get(args[0]);									// Path to the text file
		Charset utf8 = Charset.forName("UTF-8");								// Charset used to build the text file reader	

		FileOutputStream out = new FileOutputStream(args[1]);				// Object used to write bytes on the binary file

		int numLinhas;														// Number of lines in the text file
		BufferedReader br = Files.newBufferedReader(arquivoTxt, utf8);		// Object used to read lines from the text file
		String line;														// Line read from the text file, using buffered reader
		byte[] data, numero;												// Array of bytes contained in the line read from the text file 
																			//	and the array used to store integer values in the binary file

		
		// Find out number of lines in the text file and write it on the binary file
		LineNumberReader count = new LineNumberReader(br);
		while(count.skip(Long.MAX_VALUE) > 0) {
			// Loop to go to the end of the text file
		}
		numLinhas = count.getLineNumber() + 1;								// index of the last line of the file + 1(since the lines start at 0)
		out.write(toBytes(numLinhas));

		
		// Write the index of the binary file
		int previous = 0;													// number of bytes from the previous read lines
		br.close();

		br = Files.newBufferedReader(arquivoTxt, utf8);
		while((line = br.readLine()) != null) {
			data = line.getBytes("UTF-8");
			out.write(toBytes((numLinhas * 4 + 4) + previous));
			previous += 4 + data.length;
		}
		br.close();

		br = Files.newBufferedReader(arquivoTxt, utf8);
		while((line = br.readLine()) != null) {
			data = line.getBytes("UTF-8");
			numero = toBytes(data.length);
			out.write(numero);
			out.write(data);
		}

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
