package com.spring.basics.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	@Autowired
	@Qualifier("quick")
	private SortAlgo sortAlgo;
	
	public int binarySearch(int[] numbers, int numberToBeSearched) {
		int[] sortedNumbers = sortAlgo.sort(numbers);
		System.out.println(sortAlgo);
		
		return 3;
	}
}