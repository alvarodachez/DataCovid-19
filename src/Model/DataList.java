package Model;

public class DataList {

	private String Date; // format 15 January
	private int Value;

	public DataList(String Date, int Value) {
		this.Date = Date;
		this.Value = Value;
	}

	public String getDate() {
		return this.Date;
	}

	public int getValue() {
		return this.Value;
	}

}
