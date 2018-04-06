package exercicios;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ConverteBinTxt_6 {
	
	public static void main(String[] args) {
		Path arquivoBin = Paths.get(args[0]);
		
		try {
			  byte[] data = Files.readAllBytes(arquivoBin);
			  PrintWriter writer = new PrintWriter(args[1], "UTF-8");
			  
			  int i = 0;
			  int quantBytes;
			  
			  do {
				  quantBytes = (data[i]<<24)&0xff000000|
					       (data[i + 1]<<16)&0x00ff0000|
					       (data[i + 2]<< 8)&0x0000ff00|
					       (data[i + 3]<< 0)&0x000000ff;
				  i += 4;
				  
				  writer.println(new String(Arrays.copyOfRange(data, i, i+quantBytes), "UTF-8"));
				  i += quantBytes;
			  }while (data[i] != 0xFF);
			  
			  writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
