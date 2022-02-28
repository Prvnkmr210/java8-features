package com.practice.stream;

import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseElements {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(11, 22, 33, 44);
		stream.collect(reverseStream()).forEach(n -> System.out.println(n));

	}
	
	public static <T> Collector<T, ?, Stream<T>> reverseStream(){
		
		return Collectors.collectingAndThen(Collectors.toList(), list -> {
			Collections.reverse(list);
			return list.stream();
		});
		
	}

}
