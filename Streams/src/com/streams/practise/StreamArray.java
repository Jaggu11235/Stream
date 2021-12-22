package com.streams.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PP
{	
	public static void main(String[] args)
	{
		Integer[] n = {10,30,1,2,5,6,90};
		
		List<Integer> l = Arrays.stream(n).sorted().collect(Collectors.toList());
		
		System.out.println(l);
	}
}
