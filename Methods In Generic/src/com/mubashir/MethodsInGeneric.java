package com.mubashir;

import java.util.*;
class Data {
	public <E> void printListData(List<E> list) {
		for(E element :list) {
			System.out.println(element);
		}
		System.out.println("**************");
	}
	public <E> void printArrayData(E[] arrayData) {
		for(E element :arrayData) {
			System.out.println(element);
		}
		System.out.println("**************");
	}
}

public class MethodsInGeneric {
     
	public static void  main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);	
		Data data = new Data();
		data.printListData(list);
		List<String> list2 = new ArrayList<>();
		list2.add("one");
		list2.add("two");
		list2.add("three");
		list2.add("four");
		list2.add("five");
		list2.add("six");
		list2.add("seven");
		list2.add("eight");
		list2.add("nine");
		list2.add("ten");
		data.printListData(list2);

        String[] stringArray = {"one" , "two" ,"three"};
        Integer[] IntegerArray = {1,3,4,5,6,67,4,32,3};
        Double[] doubleArray = {0.544,0.6765,0.644363,0.685784};
        data.printArrayData(stringArray);
        data.printArrayData(IntegerArray);
        data.printArrayData(doubleArray);

  

        
	}
	
}
