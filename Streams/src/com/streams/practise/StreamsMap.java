package com.streams.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMap {

	public static void main(String args[])
	{
		
		/*
		 * map :
		 * =========
		 * input --> 10 elements
		 * output --> 10 elements
		 */
		
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		
		Stream<Integer> s = list.stream();
		
		// map(function) - return any kind of value(int, float, long) - used to do some business logic and then generate a new object
		
		//Stream<Integer> s1 = list.stream();
		
		List<Integer> mapList = s.map(i->i+5).collect(Collectors.toList());
		
		System.out.println(mapList);
		
	}
}
