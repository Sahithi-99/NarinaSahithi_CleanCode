package com.bank.interest;

import static org.junit.Assert.*;

import org.junit.Test;

public class Compound_InterestTEST {

	@Test
	public void test() {
		Compound_Interest obj=new Compound_Interest(5000, 0.10, 1, 3);
		double result=obj.compound_interest_calculation();
		assertEquals(6655.00, result, 6655.00);
	}

}
