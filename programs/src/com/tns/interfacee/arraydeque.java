package com.tns.interfacee;

import java.util.*;  

public class arraydeque {  
   public static void main(String[] args) {  
   //Creating Deque and adding elements  
   Deque<String> deque = new ArrayDeque<String>();  
   deque.add("Saurabh");    
   deque.add("Tushar");     
   deque.add("Nachiket");    
   //Traversing elements  
   for (String str : deque) {  
   System.out.println(str);  
   }  
   }  
}  
