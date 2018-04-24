package exerciciosSerialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Serializa_2 implements Serializable{
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Slime slime = new Slime("Blue", "Vegetables", "HeartBeete");

		serialize(slime);

		System.out.println("\nO objeto em sua forma original é: " + deserialize().toString());
	}

	public static void serialize(Serializable s) throws IOException {
		FileOutputStream fos = new FileOutputStream("serialized.ser");
		ObjectOutputStream out = new ObjectOutputStream(fos);

		out.writeObject(s);
		out.close();
		fos.close();
		System.out.print("O objeto em forma serializada em bytes é: ");

		byte[] data = Files.readAllBytes(Paths.get("serialized.ser"));
		for (int i = 0; i < data.length; i++) {
			System.out.printf("%02X ", data[i]);
		}
		System.out.println();

	}

	public static Slime deserialize() throws IOException, ClassNotFoundException {
		FileInputStream fileIn = new FileInputStream("serialized.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);

		Slime slime = (Slime) in.readObject();
		in.close();
		fileIn.close();

		return slime;
	}
}
