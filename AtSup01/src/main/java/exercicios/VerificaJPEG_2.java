package exercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class VerificaJPEG_2 {

	public static void main(String[] args) {
		Path path = Paths.get(args[0]);
		try {
			byte[] data = Files.readAllBytes(path);

			if(String.format("%02X ", data[0]).contains("FF") && String.format("%02X ", data[1]).contains("D8")
					&& String.format("%02X ", data[data.length-2]).contains("FF") && String.format("%02X ", data[data.length-1]).contains("D9")) {
				System.out.println("O arquivo especificado é um JPEG");
			} else {
				System.out.println("O arquivo especificado não é um JPEG");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

