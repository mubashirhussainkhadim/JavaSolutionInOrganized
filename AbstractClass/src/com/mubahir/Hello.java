package com.mubahir;
import com.mubashir.person.*;
public class Hello {
   public static void main(String[] args) {
	   Person mubashir = new Vegan();
	   
	   
	   mubashir.breath();
		System.out.println("---------------------");
	   mubashir.message();
	System.out.println("---------------------");
	   mubashir.speak();
	   mubashir.eat();
//	System.out.println("---------------------");
//	   Person mubashir_hussain = new NonVegan();
//	   mubashir_hussain.eat();
//	   mubashir_hussain.speak();
   }
}
