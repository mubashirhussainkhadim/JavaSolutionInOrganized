//package com.mubashir;
//
//public class App {
//   
//	public static void main(String[] args) {
//	   int x =10;
//		new Thread(()->System.out.println("the valie os x: "+ x)).start();
//	}
//}
package com.mubashir;

import java.util.ArrayList;
import java.util.List;
class Data {
	private String Name;

	public Data(String name) {
		this.Name = name;
	}

	@Override
	public String toString() {
		return "Data [Name=" + this.Name + "]";
	}

	public String getName() {
		return this.Name;
	}
	
}
public class App {
   
	public static void main(String[] args) {
		List<Data> list = new ArrayList<>();
        list.add(new Data("Mubashir"));
        list.add(new Data("Haseeb"));
        list.add(new Data("Minahil"));
        list.add(new Data("Fatima"));
        list.add(new Data("Adnan"));
        list.add(new Data("Keran"));

		list.forEach(temp -> {
			System.out.println(temp.getName());
		});
		
//	   List<Integer> list = new ArrayList<>();
//	   for (int i = 1; i <20 ; i++){
//		 
//		    list.add(i);
//	   }
//	   list.forEach(i->{
//		   if (i%2 == 0 ) {
//		   System.out.println( "IndexOff: " + list.indexOf(i)+ " odd Number :"+i);};
//		   });
//
	   
	}
}
