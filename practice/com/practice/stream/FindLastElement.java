package com.practice.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class FindLastElement {

	public static void main(String[] args) {
		Stream<?> streams = Stream.of(10,14,17,8,12,6);
		System.out.println(lastElementInStream(streams));
		
		Stream<?> streams2 = Stream.of(10,14,17,8,12,6);
		Optional<?> num  = streams2.skip(streams2.count()-1).findFirst();
		// Error thrown because streams2 is being operated twice. 
		System.out.println(num.get());
		
	}
	
	public static <T> T lastElementInStream(Stream<T> streams){
		Optional<T> num  = streams.reduce((a,b) -> b);
		return num.isPresent() ? num.get() : null;
	}

}
