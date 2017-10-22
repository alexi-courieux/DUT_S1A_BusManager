package com.unice;

import org.junit.*;

public class BusTest {
	Bus busA;
	
	@Before
	/**Cr�er des bus pour les tests*/
	public void initialise(){
		busA = new Bus("A", "Pro");
	}
	@After
	public void clean(){
		busA = null;
	}
	@Test
	public void getBusName(){
		Assert.assertEquals("A", busA.getName());
	}
	@Test
	public void getBusType(){
		Assert.assertEquals("Pro", busA.getBusType());		
	}
}