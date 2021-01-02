package com.spring.basics;

import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgo implements SortAlgo {

	@Override
	public int[] sort(int[] numbers) {
		return numbers;
	}
}