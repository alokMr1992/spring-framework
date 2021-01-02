package com.spring.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgo implements SortAlgo {

	@Override
	public int[] sort(int[] numbers) {
		return numbers;
	}
}