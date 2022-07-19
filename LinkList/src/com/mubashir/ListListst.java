package com.mubashir;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;



public class ListListst {
     public static void main(String[] args) {
    	 List<String> countries = new LinkedList<>();
    	 countries.add("Pakistan");
    	 countries.add("America");
    	 countries.add("Ireland");
    	 countries.add("Russia");
    	 countries.add("WEtnam");
    	 countries.add("China");
    	 countries.add("INdonasia");
    	 countries.add("Srilanka");
    	 countries.add("London");
    	 countries.add("Iran");
    	 ListListst app =  new ListListst();
    	 app.printList(countries);
         System.out.println("************");
         countries.sort(null);
    	 app.printList(countries);
         System.out.println("************");
         Collections.reverse(countries);
    	 app.printList(countries);

    	 
    	 

     }
     void printList(List<String> list) {
    	ListIterator <String>  iterator = list.listIterator();
    	 while(iterator.hasNext()) {
    		 System.out.println("Elemets:  " + iterator.next());
    		 
    	 }
     }
     
  
}
