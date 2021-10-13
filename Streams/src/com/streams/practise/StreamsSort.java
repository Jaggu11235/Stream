package com.streams.practise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsSort
{
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<>();
		list.add(25);
		list.add(70);
		list.add(45);
		list.add(10);
		list.add(65);
		list.add(20);
		
		Supplier<Stream<Integer>> s = () -> list.stream();
		Comparator<Integer> c = (i1,i2)->(i1>i2)?-1:(i1<i2)?1:0; // descending order logic using comparator
		List<Integer> ascendingOrder = s.get().sorted().collect(Collectors.toList());
		List<Integer> sortedList = s.get().map(i -> i+5).sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList()); // descending order using comparable
		List<Integer> sortedList1 = s.get().map(i -> i+5).sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList()); // descending order using comparable
		List<Integer> sortedList2 = s.get().map(i -> i+5).sorted(c).collect(Collectors.toList());
		System.out.println(ascendingOrder);
		System.out.println(sortedList);
		System.out.println(sortedList1);
		System.out.println(sortedList2);
	}

}
