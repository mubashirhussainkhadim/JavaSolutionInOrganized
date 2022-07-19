package com.mubashir;

class Data <K extends Integer,V extends BoundedTypePararmeters> {
	private K key;
	private V value;
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	public <E extends Character,N extends Number> void display(E element, N number) {
		System.out.println("Element: "+element+" Number: "+number);
	}
	
}

public class BoundedTypePararmeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Data<Integer, BoundedTypePararmeters> data = new Data<Integer, BoundedTypePararmeters> (1, new BoundedTypePararmeters());
        data.display('$', 1);
        data.getValue().text();
	}
	public void text() {
		System.out.println("Testing");
	}

}
