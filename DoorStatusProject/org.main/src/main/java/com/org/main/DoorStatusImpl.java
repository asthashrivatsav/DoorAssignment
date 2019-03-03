package com.org.main;

import com.org.exceptions.InvalidInputException;

/**
* This DoorStatusImpl class implements 
* the functionality to return
* the status of the door 
* provided as input
* @author  Astha.Shrivastav
* @version 1.0
*/

public class DoorStatusImpl implements DoorStatus {
	/**
	 * This method returns the 
	 * status of the door ,
	 * whether is door is opened or 
	 * closed based on the factors of the doors 
	 * being passed
	 *@param door 
	 *@exception IllegalArgument-when passed negative integer
	 *@return String - 'closed' or 'open'
	 *
	 */

	public String getDoorStatus(Integer door) {
		String status = "";
		
		 if(door<0 ){
	            throw new InvalidInputException("Kindly Enter valid value for door.");
	        }
		
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
	
	/**
	 * This method returns the number  
	 * of factors of doors ,
	 * 
	 *@param int 
	 * @return int - count of factors
	 *
	 */

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
