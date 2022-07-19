package com.mubashir;


import com.mubashir.testrun.*;

public class App {
    public static void main(String[] args) {
    	TestStatic obj1 = new TestStatic();
    	System.out.println(obj1.getStaticVaraible());
    	obj1.setStaticVaraible(7);
    	System.out.println(obj1.getStaticVaraible());
    	TestStatic obj2 = new TestStatic();
    	System.out.println(obj2.getStaticVaraible());
    	obj2.setStaticVaraible(0);
    	System.out.println(obj2.getStaticVaraible());



    }
}
