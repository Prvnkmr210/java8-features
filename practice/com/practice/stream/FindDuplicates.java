package com.practice.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicates {
	
	public static void main(String[] args) {
		Stream<Integer> streams = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
		
		Set<Integer> intSet = new HashSet<>();
		System.out.println(streams
				.filter(n -> !intSet.add(n))
				.collect(Collectors.toSet()));
		
//		Stream<Integer> streams2 = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
//		System.out.println(streams2
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//				.entrySet()
//				.stream()
//				.peek((n) -> System.out.println(n))
//				.collect(Collectors.toSet()));
	}

}
