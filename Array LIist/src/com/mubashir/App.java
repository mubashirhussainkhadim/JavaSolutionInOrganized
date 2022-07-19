package com.mubashir;
import java.util.ArrayList;
public class App {
    static ArrayList<String> listNames = new ArrayList<>();
	public static void main(String[] args) {
        listNames.add("Mubashir");
        listNames.add("Ali");
        listNames.add("ADnam");
        listNames.add("Mannan");
        listNames.add("Fatima");
        listNames.add("Minahil");
        listNames.add("KHURAM");
        listNames.add("Saboor");
//        System.out.println(listNames.get(0) +" " + listNames.get(1));
        
//        System.out.println(listNames);
        App app = new App();
//        app.displayList(listNames);
//        System.out.println("--------------");
//        app.removeNameByPoistion(2);
//        app.displayList(listNames);
//        System.out.println("--------------");
//        app.removeNameByString("Minahil");
//        app.displayList(listNames);
//        app.displayList(listNames);
//        System.out.println("-------------");
//        app.modifyName(3, "Mubashir Hussain");
//        app.displayList(listNames);
          app.displayList(listNames);
          int position = app.search("Mannan");
          System.out.println("-------------");
          System.out.println(position);
          if(position !=1) {
              System.out.println("-------------");
        	  app.modifyName(position, "FATIMA Ali");
              System.out.println("-------------");
              app.displayList(listNames);
          }
          else {
              System.out.println("-------------");
              System.out.println("InValid Entry");

          }

	}
	void displayList(ArrayList<String> names) {
		for(String listNames : names) {
			System.out.println(listNames);
		}
	}
	void removeNameByPoistion(int position) {
		System.out.println(listNames.remove(position));
	}
	void removeNameByString(String Name) {
		System.out.println(listNames.remove(Name));
	}
	void modifyName(int position , String newName) {
		listNames.set(position, newName);
	}
	int search(String name) {
		return listNames.indexOf(name);
	}

}
