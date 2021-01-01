package com.spring.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgo());
		int result = binarySearch.binarySearch(new int[] {1, 2, 12, 7}, 2);
		System.out.println(result);
		
		//SpringApplication.run(SpringFrameworkApplication.class, args);
	}
}