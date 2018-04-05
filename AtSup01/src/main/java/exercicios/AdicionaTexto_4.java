package exercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AdicionaTexto_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Files.write(Paths.get(args[0]), args[1].getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

