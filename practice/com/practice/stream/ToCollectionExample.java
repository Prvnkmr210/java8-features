package com.practice.stream;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToCollectionExample {
	
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
		
		ArrayList<Integer> alist = stream.collect(Collectors.toCollection(ArrayList::new));
		System.out.println(alist);
		
		
	}

}
