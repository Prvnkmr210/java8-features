package com.practice.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveArrayElement {
	
	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5 };
		int index = 2;
		
		int[] op = IntStream.range(0, arr.length)
	            .filter(i -> i != index)
	            .map(i -> arr[i])
	            .toArray();
		
		System.out.println( Arrays.toString(op));
	}

}
