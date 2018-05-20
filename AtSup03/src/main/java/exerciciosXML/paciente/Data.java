package exerciciosXML.paciente;

import java.util.Calendar;

public class Data {
	private Calendar data;
	private String acuracia;
	
	/**
	 * @return the data
	 */
	public Calendar getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Calendar data) {
		this.data = data;
	}
	
	/**
	 * @return the acuracia
	 */
	public String getAcuracia() {
		return acuracia;
	}
	/**
	 * @param acuracia the acuracia to set
	 */
	public void setAcuracia(String acuracia) {
		this.acuracia = acuracia;
	}
	
	public Data(Calendar data, String acuracia) {
		super();
		this.data = data;
		this.acuracia = acuracia;
	}
	
	@Override
	public String toString() {
		return "\n ---Data [data=" + data + ", acuracia=" + acuracia + "]";
	}
}
