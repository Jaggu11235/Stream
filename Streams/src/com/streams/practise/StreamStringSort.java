package com.streams.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStringSort {
	
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Sunny");
		list.add("Bunny");
		list.add("Sruthi");
		list.add("Kajal");
		
		List<String> sortedList = list.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(sortedList);
	}

}
