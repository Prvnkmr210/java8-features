package com.practice.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamWithIndices {
	
//	Input: Stream = [G, e, e, k, s]
//	Output: [0 -> G, 1 -> e, 2 -> e, 3 -> k, 4 -> s]
	public static void main(String[] args) {
		 String[] array = { "G", "e", "e", "k", "s" };
		 
		 IntStream.range(0, array.length).mapToObj(n -> String.format("%d -> %s", n, array[n]))
		 			.forEach(System.out::println);
		 
		 
//		 Arrays.stream(array)		 	
//		 	.map(n -> String.format("%d -> %s", n)).forEach(System.out::println);
	}

}
