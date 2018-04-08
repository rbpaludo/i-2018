package exercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AdicionaTexto_4 {

	public static void main(String[] args) throws IOException {

		Files.write(Paths.get(args[0]), args[1].getBytes(), StandardOpenOption.APPEND);
	}

}

