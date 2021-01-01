package com.spring.basics;

public class BinarySearchImpl {
	
	private SortAlgo sortAlgo;

	public BinarySearchImpl(SortAlgo sortAlgo) {
		super();
		this.sortAlgo = sortAlgo;
	}
	
	public int binarySearch(int[] numbers, int numberToBeSearched) {
		int[] sortedNumbers = sortAlgo.sort(numbers);
		System.out.println(sortAlgo);
		
		return 3;
	}
}