package com.practice.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class MaptToStream {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "A");
		map.put(2, "B");
		
		System.out.println("Map: " + map);
		
		Stream<Entry<Integer, String>> stream = map.entrySet().stream();
		System.out.println(Arrays.toString(stream.toArray()));

	}

}
