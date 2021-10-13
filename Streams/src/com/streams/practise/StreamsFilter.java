package com.streams.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsFilter {
	
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		
		/*
		 * filter :
		 * =========
		 * input --> 10 elements
		 * output --> 0 to 10 (or) less than or equal to 10 elements(<=10)
		 */
		// creation of stream --> on collection we need to call stream method 
		Stream<Integer>  s =list.stream();
		
		// we can configure stream based on "filter" and "map"
		
		// filter(Predicate) - return type is boolean - to perform conditional checks we can use filter
		
		List<Integer> filterList = s.filter(i -> i%2 ==0).collect(Collectors.toList());
		
		System.out.println(filterList);
		
		
		
	}
}
