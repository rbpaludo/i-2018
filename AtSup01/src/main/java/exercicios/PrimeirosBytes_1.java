package exercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PrimeirosBytes_1 {

	public static void main(String[] args) {
		Path path = Paths.get(args[0]);
		try {
			byte[] data = Files.readAllBytes(path);
			System.out.println("Os 4 primeiros bytes do arquivo especificado são: ");

			for (int i = 0; i < Math.min(4, data.length); i++) {
				System.out.println(String.format("%02X ", data[i]) + "\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
