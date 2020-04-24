package Operations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Model.Data;
import Model.DataList;

public class Helper {

	// WRITE FILE METHOD
	public static void writeFile(Data d1, String file) throws IOException {
		FileWriter write = new FileWriter(file);
		PrintWriter writeFlow = new PrintWriter(write);
		writeFlow.println("date;value");
		String line;

		for (DataList aux : d1.getDataList()) {
			line = aux.getDate() + ";" + aux.getValue();
			writeFlow.println(line);
		}
		writeFlow.close();
		write.close();
	}

	// LOAD FILE METHOD
	public static void loadFile(Data d1, String file) throws IOException {
		FileReader reader = new FileReader(file);
		BufferedReader readerFlow = new BufferedReader(reader);

		String line = readerFlow.readLine();

		while (line != null) {
			String[] sp = line.split(";");
			if (sp[0].compareTo("date") != 0) {
				d1.addValue(sp[0], Integer.valueOf(sp[1]));
			}
			sp = null;
			line = readerFlow.readLine();
		}

		readerFlow.close();
		reader.close();

	}
	
	//PRINT VERSION
	public static String printVersion() {
		return "Version 1.0";
	}
	//SUM OPERATION
	public static int sumOperation(int a, int b) {
		return a + b;
	}
}
