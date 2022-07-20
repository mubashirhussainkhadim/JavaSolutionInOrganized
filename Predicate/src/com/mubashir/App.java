package com.mubashir;

import java.util.function.IntPredicate;

public class App {
   public static void main(String[] args) {
       
	   IntPredicate lessthan18 = i ->i<18;
	   IntPredicate Morethan10 = i ->i>10;
        new App().demo(15, lessthan18,Morethan10);
	   
//	   IntPredicate lessthan18 = new IntPredicate() {
//
//		@Override
//		public boolean test(int value) {
//			if (value < 18) {
//				return true;
//			} else {
//			return false;
//			}  
//		}
//		   
//	   };
	   System.out.println(lessthan18.and(Morethan10).test(13));
   }
   public void demo(int x , IntPredicate lessthan18, IntPredicate Morethan10) {
	   if(lessthan18.and(Morethan10).test(x)) {
		   System.out.println("The Input is less than 18 and more than 10"); 
	   }else {
		   System.out.println("invalid Input");
	   }
}
}
