package com.apxone.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.apxone.factory.ShapFactory;
import com.apxone.factory.ShapNotAvailableException;

public class ShapTestClass {

	ShapFactory factory = new ShapFactory();
	
	@Test
	public void testCircleShap() {
		assertNotNull(factory.getSapInstance("circle"));
	}
	
	@Test
	public void testSquareShap() {
		assertNotNull(factory.getSapInstance("square"));
	}
	
	@Test
	public void testNullShape() {
		assertNull(factory.getSapInstance(null));
	}
	
	@Test(expected=ShapNotAvailableException.class)
	public void shapNotAvailableException() {
		factory.getSapInstance("squaree");
	}
	
}
