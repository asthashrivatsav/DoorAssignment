package com.org.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoorStatusTest {

	@Test
	public void testGetDoorStatus() {

		DoorStatusImpl status = new DoorStatusImpl();
		assertEquals("open", status.getDoorStatus(9));
	}

	@Test
	public void testGetDoorStatusClosed() {

		DoorStatusImpl status = new DoorStatusImpl();
		assertEquals("closed", status.getDoorStatus(3));
	}
}
