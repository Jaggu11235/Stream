package com.streams.practise;

import java.util.ArrayList;

public class StreamsMin {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(34);
		list.add(46);
		list.add(52);
		list.add(55);
		list.add(1);
		list.add(29);
		
		int minElement = list.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(minElement);
	}

}
