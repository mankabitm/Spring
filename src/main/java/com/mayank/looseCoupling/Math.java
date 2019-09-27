package com.mayank.looseCoupling;

public class Math {

	public int sum(int[] numbers) {
		int result=0;
		for(int i:numbers) {
			result+=i;
		}
		return result;
	}
}
