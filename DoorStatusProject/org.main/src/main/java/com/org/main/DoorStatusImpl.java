package com.org.main;

public class DoorStatusImpl implements DoorStatus {

	public String getDoorStatus(int door) {
		String status = "";
		
		for(int i =1 ; i <=door ; i++){
			int countFactors = countOfFactors(i);
			if (countFactors % 2 == 0) {
				status = "closed";

			} else {
				status = "open";
			}
            System.out.println("Door at " + i + " is " + status);
			
		}
		return status;
	}
	public int countOfFactors(int n) {
		int count = 0;
		for (int j = 1; j <= n; j++) {
			if (n % j == 0) {
				count++;
			}
		}
		return count;
	}

}
