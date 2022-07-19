package com.mubashir;
import com.mubashir.shop.*;
public class Shop {
       public static void main(String[] args) {
    	   Door door = new Door();
    	  System.out.println(door.getLock().isUnlocked("test")); 
    	  System.out.println(door.getLock().isUnlocked("qwery")); 

       }
}
