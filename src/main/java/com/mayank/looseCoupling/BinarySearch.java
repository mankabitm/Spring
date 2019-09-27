package com.mayank.looseCoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	
	@Autowired
	private BubbleSort bubbleSort;
	@Autowired
	private QuickSort quickSort;
	
	public int binarySearch(int[] numbers, int pos) {
		System.out.println("In Binary Search");
		quickSort.sort(new int[] {1,2,3});
		return 3;
	}

}
