package com.spring.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgo quickSortAlgo;
	
	public int binarySearch(int[] numbers, int numberToBeSearched) {
		int[] sortedNumbers = quickSortAlgo.sort(numbers);
		System.out.println(quickSortAlgo);
		
		return 3;
	}
}