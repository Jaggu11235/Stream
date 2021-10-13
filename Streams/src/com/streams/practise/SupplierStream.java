package com.streams.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierStream {
	
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		
		// creation of stream --> on collection we need to call stream method 
		
		// Here we used Supplier - in order to perform to stream operations by creating one stream method
		
		Supplier<Stream<Integer>>  s = () -> list.stream();
		
		// we can configure stream based on "filter" and "map"
		
		// filter(Predicate) - return type is boolean - to perform conditional checks we can use filter
		
		List<Integer> filterList = s.get().filter(i -> i%2 ==0).collect(Collectors.toList());
		
		System.out.println(filterList);
		
		// map(function) - return any kind of value(int, float, long) - used to do some business logic and then generate a new value
		//Stream<Integer> s1 = list.stream();
		List<Integer> mapList = s.get().map(i->i+5).collect(Collectors.toList());
		System.out.println(mapList);
	}
}
