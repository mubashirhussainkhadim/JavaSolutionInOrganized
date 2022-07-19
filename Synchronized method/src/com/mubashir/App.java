package com.mubashir;
class Brackets{
	synchronized public  void genrate() {
		for (int i =1; i<=20; i++) {
			if(i<=10) {
				System.out.print("[<");
			}else {
				System.out.print(">]");
			}
		}
		System.out.println();
	}
}
public class App {
   public static void main(String[] args) {
	   Brackets bracket = new Brackets();
	   new Thread(new Runnable() {

		@Override
		public void run() {
			for (int i =1; i<=10; i++) {
				bracket.genrate();
			}
		}
		   
	   }).start();
	   new Thread(new Runnable() {

		@Override
		public void run() {
			for (int i =1; i<=10; i++) {
				bracket.genrate();
			}
		}
		   
	   }).start();
   }
}
