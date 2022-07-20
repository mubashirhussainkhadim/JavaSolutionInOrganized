package com.mubashir;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
	public static void main(String[] args) {
      Vehicle Bike = new Vehicle("bike" , 9444);
      Vehicle car = new  Vehicle("Car" , 9099);
      
      try(FileOutputStream fos = new FileOutputStream("Mubashir/vehicles.dat")){
    	  try(ObjectOutputStream obj = new ObjectOutputStream(fos)){
    		  obj.writeObject(Bike);
    		  obj.writeObject(car);
        	  System.out.println("Information wriiten in file");
    	  }
    
} catch (FileNotFoundException e) {
	  System.out.println("FileNotFoundException");
	e.printStackTrace();
} catch (IOException e) {
	  System.out.println("IOException");
	e.printStackTrace();
} 
	
}
}
