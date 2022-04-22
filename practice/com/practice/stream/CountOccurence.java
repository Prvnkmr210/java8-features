package com.practice.stream;

public class CountOccurence {

	public static void main(String[] args) {
		String ip = "abccdefgaa";
		char c = 'a';
		System.out.println(countOccurenece(ip,c));
		
		Stream<Integer> streams = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
		// Find count of occurence of each element in stream
		System.out.println(streams.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

	}
	
	public static int countOccurenece(String ip, char c) {
		
//		ip.chars().peek(n -> System.out.println(n)).count();
		// lazy execution. If terminal operation is not there, the method will not execute
		
		return (int) ip.chars().filter(ch -> ch==c).count();
	}

}
