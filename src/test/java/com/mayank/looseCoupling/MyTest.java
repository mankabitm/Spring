package com.mayank.looseCoupling;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyTest {

	@Test
	public void test() {
		Math mth = new Math();
		int ans=mth.sum(new int[] {1,2,3});
		assertEquals(6,ans);
	}

}
