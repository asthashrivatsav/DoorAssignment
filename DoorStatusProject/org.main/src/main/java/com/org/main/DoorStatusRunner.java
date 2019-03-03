package com.org.main;

import java.util.Scanner;

public class DoorStatusRunner {
	public static void main(String[] args) {

		DoorStatus status = new DoorStatusImpl();
		DoorStatusRunner dst = new DoorStatusRunner();
		status.getDoorStatus(dst.getDoorValue());
	}
	@SuppressWarnings("resource")
	public int getDoorValue() {
		int door = 0;
		System.out.println("Enter the number of doors :");
		Scanner sc = new Scanner(System.in);
		door = sc.nextInt();
		return door;

	}
}
