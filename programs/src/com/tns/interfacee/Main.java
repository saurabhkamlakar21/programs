package com.tns.interfacee;

import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<String>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);

        // Access element from the top
        String element = animals.peek();
        System.out.println("Element at top: " + element);

    }
}