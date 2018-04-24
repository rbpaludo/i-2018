package exerciciosSerialize;

import java.io.Serializable;

public class Slime implements Serializable{
	
	private String color;
	private String feeding;
	private String favourite;
	
	public Slime(String color, String feeding, String favourite) {
		super();
		this.color = color;
		this.feeding = feeding;
		this.favourite = favourite;
	}

	@Override
	public String toString() {
		return "Slime [color=" + color + ", feeding=" + feeding + ", favourite=" + favourite + "]";
	}
}
