package com.java.miscprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RandomTester {
	
	public static void main(String[] args){
		stringToArrayListConversion("22,33,44,55,66,77 ");
	}
	
	public static void stringToArrayListConversion(String input){
		String[] str = input.split(",");
		List<String> list = new ArrayList<>();
		list = Arrays.asList(str);
		for (String string : list) {
			System.out.println(string);
		}
	}
}
 