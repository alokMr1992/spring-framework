package com.spring.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringFrameworkBasicApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringFrameworkBasicApplication.class);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearch);
		System.out.println(binarySearch2);
		
		int result = binarySearch.binarySearch(new int[] {1, 2, 12, 7}, 2);
		System.out.println("Result = " + result);
	}
}