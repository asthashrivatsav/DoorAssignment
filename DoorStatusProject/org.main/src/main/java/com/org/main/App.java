package com.org.main;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of doors :");
		int doors = 0;
		try {
			doors = sc.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println("Please enter a valid number.");
			sc.nextLine();

		}
		DoorStatus status = new DoorStatusImpl();
		status.getDoorStatus(doors);

	}
}
