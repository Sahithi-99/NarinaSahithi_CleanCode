package com.bank.interest;

import static org.junit.Assert.*;

import org.junit.Test;

public class Simple_InterestTEST {

	@Test
	public void test() {
		Simple_Interest obj=new Simple_Interest(4000, 4.5, 3);
		double result=obj.Simple_Interest_Calculation();
		assertEquals(540.00, result, 540.00);
	}

}
