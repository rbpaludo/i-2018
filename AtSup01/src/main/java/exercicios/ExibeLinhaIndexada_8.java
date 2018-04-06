package exercicios;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ExibeLinhaIndexada_8 {
	public static void main(String[] args) {
		Path arquivoBin = Paths.get(args[0]);
		try {
			byte[] data = Files.readAllBytes(arquivoBin);

			int virtualIndex = Integer.parseInt(args[1]);
			int indexLimit = (data[0]<<24)&0xff000000|
					(data[1]<<16)&0x00ff0000|
					(data[2]<< 8)&0x0000ff00|
					(data[3]<< 0)&0x000000ff;
			if(virtualIndex > indexLimit) {
				System.out.println("A linha especificada não existe, o arquivo não é tão grande!");
			} else {
				int realIndex = (data[virtualIndex]<<24)&0xff000000|
						(data[virtualIndex + 1]<<16)&0x00ff0000|
						(data[virtualIndex + 2]<< 8)&0x0000ff00|
						(data[virtualIndex + 3]<< 0)&0x000000ff;
				int dataEnd = (data[realIndex]<<24)&0xff000000|
						(data[realIndex + 1]<<16)&0x00ff0000|
						(data[realIndex + 2]<< 8)&0x0000ff00|
						(data[realIndex + 3]<< 0)&0x000000ff;
				realIndex += 4;

				System.out.println(new String(Arrays.copyOfRange(data, realIndex, realIndex + dataEnd), "UTF-8"));
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
