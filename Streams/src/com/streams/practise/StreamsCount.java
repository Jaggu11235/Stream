package com.streams.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsCount {
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<>();
		
		list.add(70);
		list.add(45);
		list.add(10);
		list.add(65);
		list.add(20);
		list.add(25);
		
		Stream<Integer> s = list.stream();
		
		long count = s.filter(i -> i<35).count();
		
		System.out.println(count);
	}
}
