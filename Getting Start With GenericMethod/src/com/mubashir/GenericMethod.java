package com.mubashir;
 

class Data {
	private Object obj;

	public Data(Object obj) {
		this.obj = obj;
	}

	public Object getObj() { 
		return obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}
}
class GenericClass<T>{
	private T  data;

	public GenericClass(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}
	
	
}

public class GenericMethod {
     public static void main(String[] args) {
    	 
//    	 Data data = new Data("Som e String");
//    	 
//    	 String varaible =(String) data.getObj();
//    	 System.out.println(varaible);
//    	
    	 GenericClass<String> genricData = new GenericClass<String>("Some Data");
    	 String data = (String)genricData.getData();
    	 System.out.println(data);
     }
}
