package com.mubashir;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsInJava {
	public static void main(String[] args) {
//    Set<String> set = new HashSet<>();
//    set.add("Mubashir");
//    set.add("Mubashir");
//    set.add("Mubashir");
//    set.add("Mubashir");
//    set.add("adnan");
//    set.add("Minhail");
//    set.add("SANIA");
//    set.add("imran");
//    set.add("Arooj");
//    set.add("Aleena");
//    set.add("Fatima");
//    set.add("Aleena");
//    set.add("SANIA");
//    set.add("Arooj");
//    set.add("Khadeeja");
//    set.add("Aiman");
//		 for(String name: set) {
//		    	System.out.println(name);
//		     }

//	Set<Integer> set2 = new HashSet<>();
//      for (int i =10; i > 0; i--) {
//    	set2.add(i);
//      }
//      for (int i: set2) {
//    	  System.out.println(i);
//      }
//		Set<Integer> set2 = new LinkedHashSet<>();
//	      for (int i =20; i > 0; i--) {
//	    	set2.add(i);
//	      }
//	      for (int i: set2) {
//	    	  System.out.println(i);
//	      }
//    
		Set<String> set2 = new TreeSet<>();
	      for (int i =10; i > 0; i--) {
	    	set2.add("A" + i);
	      }
	      for (String i: set2) {
	    	  System.out.println(i);
	      }
   
   }
}
