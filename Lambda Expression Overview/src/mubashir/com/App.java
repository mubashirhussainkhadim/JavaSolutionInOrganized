package mubashir.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//interface Lambda{
//	public void demo();
//}

class Data {
	private String name;

	public Data(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Data [name=" + this.name + "]";
	}

	public String getName() {
		return this.name;
	}
	
}




public class App {
    public static void main(String[] args) {
    	
  
    	
    	List<Data> list = new ArrayList<>();
    	
        list.add(new Data("Mubeen"));
        list.add(new Data("Qadeer"));
        list.add(new Data("Mahboob"));
        list.add(new Data("Bilal"));
        list.add(new Data("Ali"));
        list.add(new Data("Mubashir"));
        Collections.sort(list , (Data o1 ,Data o2)-> {
        	return o1.getName().compareTo(o2.getName());
        	});
    	for(Data e :list) {
    		System.out.println(e.getName());
    	}
    	
  
//    	Thread thread1 = new Thread(()->System.out.println("I am inside thread 1"));
//    	thread1.start();
    	
    	
    	
    	
 
//    	Lambda lambda = ()->{
//    		System.out.println("Stt");
//    		System.out.println("Stt");
//    		System.out.println("Stt");
//    		System.out.println("Stt");
//    		};
//    	lambda.demo();
    	
    }
}
