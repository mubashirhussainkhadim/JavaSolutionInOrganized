package com.mubashir;
class Brackets{
	private Object lock ="lock";
	 public  void genrate() {
		synchronized (lock){for (int i =1; i<=10; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i<=5) {
				System.out.print("[");
			}else {
				System.out.print("]");
			}
		}
		System.out.println();}
		
		for (int j=0; j<=10; j++ ) {
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class App {
   public static void main(String[] args) {
	   Brackets bracket = new Brackets();
//	   bracket.genrate(); 
	   new Thread(new Runnable() {

		@Override
		public void run() {
			long startTime =System.currentTimeMillis();
			for (int i =1; i<=5; i++) {
				bracket.genrate();
			}
			long lastTime =System.currentTimeMillis();
			System.out.println("The Time REquire for thi This Thread :" +(lastTime-startTime));
		}
		   
	   }).start();
	   new Thread(new Runnable() {

		@Override
		public void run() {
			long startTime =System.currentTimeMillis();
			for (int i =1; i<=5; i++) {
				bracket.genrate();
			}
			long lastTime =System.currentTimeMillis();
			System.out.println("The Time REquire for thi This Thread :" +(lastTime-startTime));
		}
		   
	   }).start();
   }
}