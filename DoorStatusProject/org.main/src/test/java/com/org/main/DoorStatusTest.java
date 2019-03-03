package com.org.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.org.exceptions.InvalidInputException;

public class DoorStatusTest {
	DoorStatusImpl statusTest=new DoorStatusImpl();

	@Test
	public void testGetDoorStatus() {
		assertEquals("open", statusTest.getDoorStatus(9));
	}

	@Test
	public void testGetDoorStatusClosed() {

		assertEquals("closed", statusTest.getDoorStatus(3));
	}

	@Test
	public void testDoorIsNotNull() {
		assertNotNull(statusTest.getDoorStatus(9));
	}

	@Test(expected = InvalidInputException.class)
	public void testGetDoorStatusClosedNegativeValue() {

		statusTest.getDoorStatus(-3);
	}


}
