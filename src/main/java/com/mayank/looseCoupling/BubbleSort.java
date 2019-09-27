package com.mayank.looseCoupling;
import org.springframework.stereotype.Component;

@Component
public class BubbleSort {

	public int[] sort(int[] numbers) {
		System.out.println("In Bubble sort");
		return numbers;
	}
}
