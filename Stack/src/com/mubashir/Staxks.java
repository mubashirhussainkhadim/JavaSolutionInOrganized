package com.mubashir;
import java.util.Stack;

public class  Staxks {
  
	public static void main(String[] args) {
		Stack <Integer> demo = new Stack<>();
//		demo.push(0);
//		demo.push(1);
//		demo.push(2);
//		demo.push(3);
//		demo.push(4);
//		demo.push(5);
//		demo.push(6);
//		demo.push(7);
//		demo.pop();
//		
//    System.out.println(demo.peek());
//    for(int temp: demo ) {
//    	System.out.println(temp);
//    }
		
		if(demo.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("Stack is not empty");
		}
		demo.push(100);
		System.out.println(demo.search(100));
	}

}
