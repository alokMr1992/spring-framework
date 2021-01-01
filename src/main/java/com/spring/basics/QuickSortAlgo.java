package com.spring.basics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgo implements SortAlgo {

	@Override
	public int[] sort(int[] numbers) {
		return numbers;
	}
}