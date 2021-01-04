package com.spring.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.basics.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringFrameworkBasicApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringFrameworkBasicApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearch);
		System.out.println(binarySearch2);
		
		int result = binarySearch.binarySearch(new int[] {1, 2, 12, 7}, 2);
		System.out.println(result);
	}
}