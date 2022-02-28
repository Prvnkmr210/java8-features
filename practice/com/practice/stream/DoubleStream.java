package com.practice.stream;

import java.util.stream.IntStream;

public class DoubleStream {

	public static void main(String[] args) {
		// generate method takes a supplier argument
		IntStream stream = IntStream.generate(() -> {
			return (int) Math.random()*10000;
		});
		stream.limit(10).forEach((t) -> System.out.println(t));
	}

}
