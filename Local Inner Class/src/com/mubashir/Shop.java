package com.mubashir;
import com.mubashir.door.*;
public class Shop {
   public static void main(String[] args) {
//	   Door door = new Door();
//	   System.out.println(door.isLocked("qwery"));
	   
	   
	   if( new Door().isLocked(args[0])) {
		   System.out.println("Shop has closed , visited lated");
	   } else {
		   System.out.println("Wellcome");
	   }
   }
}
