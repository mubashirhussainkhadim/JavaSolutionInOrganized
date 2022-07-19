package com.mubashir.person;

public abstract class Person implements IsAlive ,LiveLife {
   public void speak() {
	   System.out.println("Urdu");
   }
   public abstract void eat();
   @Override
   public void breath() {
	   System.out.println("BE ALIVE , REMAIN LEAVING ");
   }
   @Override
   public void message() {
	   System.out.println("lIFE IS A JOURNEY , KEEP MOVING AND MEET NEW PEOPLES");
   }
}
