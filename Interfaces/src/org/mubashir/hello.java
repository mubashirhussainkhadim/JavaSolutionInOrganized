package org.mubashir;
import org.mubashir.phone.*;
public class hello {
   public static void main (String[] args) {
	   Iphone8plus phone = new Iphone8plus();
	   System.out.println(phone.spaceInGB());
	   System.out.println(phone.os());
	   System.out.println(phone.processor());
//	   String processor = phone.processor();
//	   System.out.println(processor);
   }
}