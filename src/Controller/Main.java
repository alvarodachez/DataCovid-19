package Controller;

import java.util.Scanner;

import Model.Data;
import Operations.Helper;

public class Main {

	public static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data infections = new Data("Infections");
		int flag;

		// LOAD FILE
		try {
			Helper.loadFile(infections, "DataFiles/infections.csv");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// MENU
		do {
			writeMenu();
			flag = readInteger("Write an option");

			switch (flag) {
			case 1:
				String Date = readString("Write an Date (Format: 12 January");
				int Value = readInteger("Write a value");
				infections.addValue(Date, Value);
				break;
			case 2:
				infections.setAverage();
				System.out.println("Average: " + infections.getAverage());
				break;
			case 3:
				System.out.println(infections.toString());
				break;
			}
		} while (flag != 4);

		// WRITE FILE
		try {
			Helper.writeFile(infections, "DataFiles/infections.csv");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void writeMenu() {
		System.out.println("-------MENU-------");
		System.out.println("Name: Alvaro Rueda HighSchool: IES JACARANDA");
		System.out.println("1. Add Data");
		System.out.println("2. Calculate Average");
		System.out.println("3. Show info");
		System.out.println("4. Exit.");
	}

	public static String readString(String msg) {
		String sol;

		System.out.println(msg);
		sol = keyboard.nextLine();
		return sol;
	}

	public static int readInteger(String msg) {
		int sol;

		System.out.println(msg);
		sol = Integer.parseInt(keyboard.nextLine());
		return sol;
	}

}
