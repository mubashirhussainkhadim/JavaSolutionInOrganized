package com.mubashir;

public class App {
      public static int counter = 0;
	public static void main(String[] args) throws InterruptedException  {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
                for(int i=1; i<= 1000;i++) {
                	App.counter++;
                }
                System.out.println("The looop is THread1 is over1");
			} 
		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
                for(int i=1; i<= 3000;i++) {
                	App.counter++;
                }
                System.out.println("The looop is THread1 is over2");

			} 
		});
		thread1.start();
		thread2.start();
		Thread.sleep(2000);
		System.out.println("The Value Of Counter Is: " +App.counter);
	}

}
