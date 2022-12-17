package com.api.ex;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Prog4 {

	public static void main(String[] args) 
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
//		int result=0;
//		for(int i:values)
//		{
//			result=result+ i^2;
//			
//		}
//		System.out.println(result);
		
		System.out.println(values.stream().map(i->i*2).reduce(0, (c,e)->c+e));
	}
}
