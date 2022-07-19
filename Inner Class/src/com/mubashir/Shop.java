package com.mubashir;
import com.mubashir.shop.*;
public class Shop extends Door{
     public static void main(String[] vrgs) {
    	 Door d = new Door();
    	 d.shopeState();
    	 d.getLock().setLock(false);
    	 d.shopeState();
     }
}
