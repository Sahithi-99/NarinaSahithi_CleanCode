package house_construction;

import static org.junit.Assert.*;

import org.junit.Test;

public class Construction_costTEST {

	@Test
	public void test() {
		Construction_cost obj=new Construction_cost();
		double result=obj.cost_estimation(56, "high standard", true);
		assertEquals(140000.0, result, 140000.0);
	}

}
