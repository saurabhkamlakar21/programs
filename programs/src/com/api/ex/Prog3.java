package com.api.ex;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Prog3 {

	public static void main(String[] args) 
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		
		values.forEach(i->doubleit(i));
	}
	public static void doubleit (int i)

	{
		System.out.println(i*2);
	}
}
