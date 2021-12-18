package com.midterm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Linked List
        List<Integer> javalist = new ArrayList<>();
        javalist.add(10);
        javalist.add(200);
        javalist.add(300);
//        System.out.println(javalist);

        LinkedList<String> strList = new LinkedList<>();
        strList.add("Good");
        strList.add("Morning");
        strList.add("Everyone");
        strList.addFirst("Hi");
        strList.add(2, "Welcome");
//        System.out.println(strList);

        // Stack - LIFO
        Stack<String> stkList = new Stack<>();
        stkList.push("Red");
        stkList.push("Pink");
        stkList.push("Green");
        stkList.push("Black");

        System.out.println(stkList);

        String str = stkList.pop();
        System.out.println(stkList);
        System.out.println("element out " + str);
        System.out.println("element at top " + stkList.peek());
        System.out.println("stack after changes " + stkList);

        int position = stkList.search("Green");
        System.out.println("Green is at " + position);
    }
}
