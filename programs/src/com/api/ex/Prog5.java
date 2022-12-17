package com.api.ex;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import programs.prog5;

public class Prog5 {

	public static void main(String[] args) 
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		int reult=0;
		for(int i:values)
		{
			if(i%5==0)
			{
				int result = i*2;
				break;
			}
		}

//		System.out.println(result);
		
		System.out.println(values.stream().filter(Prog5::isDivisible).map(Prog5::mapDouble).findFirst().orElse(0));
	}
	public static boolean isDivisible (int i)
	{
		System.out.println("in Dvs "+1);
		return i%5==0;
	}
	public static int mapDouble(int i)
	{
		System.out.println("in mapDouble "+1);
		return i*2;
	}
	}
