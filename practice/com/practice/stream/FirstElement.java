package com.practice.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class FirstElement {
	
	
	public static void main(String[] args) {
		Stream<?> streams = Stream.of(10,14,17,8,12,6);
//		Optional<?> opt = streams.findFirst();
//		System.out.println(opt.isPresent() ? opt.get() : null);
		
		System.out.println(firstElementInStream(streams));
		
	}
	
	public static <T> T firstElementInStream(Stream<T> streams){
		Optional<T> num  = streams.reduce((a,b) -> a);
		return num.isPresent() ? num.get() : null;
	}
	

}
