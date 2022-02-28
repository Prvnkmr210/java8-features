package com.practice.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StringToChar {
	
	public static void main(String[] args)
    {  
        // Get the String to be converted
        String str = "Geek";
  
        // Get the List of Character
        List<Character> chars = convertStringToCharList(str);
  
        // Print the list of characters
        System.out.println(chars);
    }
	
	public static List<Character> convertStringToCharList(String str)
    {  
      // Create an empty List of character
      List<Character> chars = str  
      // Convert to String to IntStream
      .chars()  
      // Convert IntStream to Stream<Character>
      .mapToObj(e -> (char)e)  
      // Collect the elements as a List Of Characters
      .collect(Collectors.toList());  
      
      return chars;
    }

}
