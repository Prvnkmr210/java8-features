package com.praveen.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardGenerics {
	
	public static void main(String[] args) {
		List<Integer> integrList = new ArrayList<> ();
		integrList.add(3);
		
		printList(integrList);
	}
	
	public static <T> void printList(List<T> myList) {
		System.out.println(myList);
	}

}
