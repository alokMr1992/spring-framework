package com.spring.basics;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgo implements SortAlgo {

	@Override
	public int[] sort(int[] numbers) {
		return numbers;
	}
}