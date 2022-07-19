package com.mubashir;
import java.util.*;
class Vehical{
	private int vehicalId;

	public Vehical(int vehicalId) {
		this.vehicalId = vehicalId;
	}

	public int getVehicalId() {
		return vehicalId;
	}

	@Override
	public String toString() {
		return "Vehical [vehicalId=" + vehicalId + "]";
	}
	 void info() {
		System.out.println("Vehicalid id:" + getVehicalId());
	}
	
}
class Car extends Vehical {
	private String CarModel;
	public Car(int vehicalId , String carModal) {
		super(vehicalId);
		CarModel = carModal;
	}
	public String getCarModel() {
		return CarModel;
	}
	@Override
	public String toString() {
		return "Car [CarModel=" + CarModel + "]";
	}
	@Override
     void info() {
		System.out.println("Car Id:" + getCarModel());
	}
}
public class WilCardsInGenerics {
	public static void main(String[] args) {
		List<Vehical> list = new ArrayList<>();
		list.add(new Vehical(10));
		list.add(new Vehical(11));
		list.add(new Vehical(12));
		list.add(new Vehical(13));
		list.add(new Vehical(14));
		list.add(new Vehical(15));
		
		display(list); 
		List<Vehical> list2 = new ArrayList<>();

		list2.add(new Car(14, "A24"));
		list2.add(new Car(894, "A14"));
		list2.add(new Car(1784, "A94"));
		list2.add(new Car(1466, "A74"));
		list2.add(new Car(1455, "A54"));
		display(list2); 


		

	}                        
	public static void display(List<? extends  Vehical > list) { // for upper bound extends Vehical or parent class
		for(Vehical element:list) {
			element.info();
		}
		System.out.println("*************");
	}
}
