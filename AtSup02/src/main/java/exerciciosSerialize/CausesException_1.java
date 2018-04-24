package exerciciosSerialize;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CausesException_1 implements Serializable{

	private NotSerializable notSerializable;

	public static void main(String[] args) throws IOException {
		CausesException_1 causaEx = new CausesException_1();
		causaEx.notSerializable = new NotSerializable();
		System.out.println(TamanhoEmBytes(causaEx));
	}

	private static int TamanhoEmBytes(Serializable s) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);

		oos.writeObject(s);
		oos.close();

		return baos.toByteArray().length;
	}
}
