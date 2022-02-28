package com.practice.stream;

public class CountOccurence {

	public static void main(String[] args) {
		String ip = "abccdefgaa";
		char c = 'a';
		System.out.println(countOccurenece(ip,c));

	}
	
	public static int countOccurenece(String ip, char c) {
		
//		ip.chars().peek(n -> System.out.println(n)).count();
		// lazy execution. If terminal operation is not there, the method will not execute
		
		return (int) ip.chars().filter(ch -> ch==c).count();
	}

}
