package com.mubashir;
class Brackets{

	synchronized static public  void genrate(String threadCode) {
		for (int i =1; i<=10; i++) {
			if(i<=5) {
				System.out.print("[<");
			}else {
				System.out.print(">]");
			}
		}
		System.out.println("Genrated by thread: "+ threadCode);
	}
}
public class App {
   public static void main(String[] args) {
//	   Brackets bracket1 = new Brackets("Thread 1");
//	   Brackets bracket2 = new Brackets("THread 2");

	   new Thread(new Runnable() {

		@Override
		public void run() {
			for (int i =1; i<=5; i++) {
				Brackets.genrate("THread 1");
			}
		}
		   
	   }).start();
	   new Thread(new Runnable() {

		@Override
		public void run() {
			for (int i =1; i<=5; i++) {
				Brackets.genrate("Thread 2");
			}
		}
		   
	   }).start();
   }
}
