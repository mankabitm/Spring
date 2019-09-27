package com.mayank.looseCoupling;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort {

	public int[] sort(int[] numbers) {
		System.out.println("In Quick sort");
		return numbers;
	}
}
