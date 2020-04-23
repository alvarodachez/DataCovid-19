package Model;

import java.util.ArrayList;

public class Data {

	private String Name;
	private int Average;
	private ArrayList<DataList> DataList;

	public Data(String Name) {
		this.Name = Name;
		this.Average = 0;
		this.DataList = new ArrayList<DataList>();
	}

	public String getName() {
		return this.Name;
	}

	public int getAverage() {
		return this.Average;
	}

	public ArrayList<DataList> getDataList() {
		ArrayList<DataList> aux = new ArrayList<DataList>();

		aux.addAll(this.DataList);

		return aux;
	}

	public void setAverage() {
		int acum = 0;

		for (DataList aux : this.DataList) {
			acum = acum + aux.getValue();
		}

		this.Average = acum / this.DataList.size();
	}

	public void addValue(String Date, int Value) {
		this.DataList.add(new DataList(Date, Value));
	}
	
	public String getValueAccordingDate(String Date) {
		
		int pos = 0;
		for(DataList aux : this.DataList) {
			if(Date.compareTo(aux.getDate()) == 0) {
				pos = this.DataList.indexOf(aux);
			}
		}
		
		return "Date: " + this.DataList.get(pos).getDate() + "Value: " + this.DataList.get(pos).getValue();
	}

	public String toString() {
		StringBuilder aux = new StringBuilder();

		this.setAverage();

		for (DataList d : this.DataList) {
			aux.append("Date: " + d.getDate() + "Value: " + d.getValue() + "\n");
		}

		return "Name: " + this.Name + " Average: " + this.Average + "\n" + aux;
	}

}
