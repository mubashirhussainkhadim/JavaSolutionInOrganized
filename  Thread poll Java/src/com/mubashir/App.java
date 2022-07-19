package com.mubashir;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SomeThread extends Thread{
	private String name;

	public SomeThread(String name) {
		this.name = name;
	}
	@Override
	public void run() {
     
	System.out.println("Starting thread: "+ name);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("thread ended: "+ name);

	}
	
}
public class App {
  
	
	public static void main(String[] args) {
		
		ExecutorService excutorService = Executors.newFixedThreadPool(2);
		
		
		 SomeThread thread1 = new SomeThread("Theard1");
		 SomeThread thread2 = new SomeThread("Theard2");
		 SomeThread thread3 = new SomeThread("Theard3");
		 SomeThread thread4 = new SomeThread("Theard4");
		 SomeThread thread5 = new SomeThread("Theard5");
		 SomeThread thread6 = new SomeThread("Theard6");
		 SomeThread thread7 = new SomeThread("Theard7");
		 SomeThread thread8 = new SomeThread("Theard8");
		 SomeThread thread9 = new SomeThread("Theard9");
		 SomeThread thread10 = new SomeThread("Theard10");
		 SomeThread thread11 = new SomeThread("Theard11");
		 SomeThread thread12 = new SomeThread("Theard12");
		 SomeThread thread13 = new SomeThread("Theard13");
		 SomeThread thread14 = new SomeThread("Theard14 ");
		 SomeThread thread15 = new SomeThread("Theard15 ");
		 SomeThread thread16 = new SomeThread("Theard16 ");

		 
		 excutorService.execute(thread1);
		 excutorService.execute(thread2);
		 excutorService.execute(thread3);
		 excutorService.execute(thread4);
		 excutorService.execute(thread5);
		 excutorService.execute(thread6);
		 excutorService.execute(thread7);
		 excutorService.execute(thread8);
		 excutorService.execute(thread9);
		 excutorService.execute(thread10);
		 excutorService.execute(thread11);
		 excutorService.execute(thread12);
		 excutorService.execute(thread13);
		 excutorService.execute(thread14);
		 excutorService.execute(thread15);
		 excutorService.execute(thread16);



		 excutorService.shutdown();
		 
		 
//         thread1.start();
//         thread2.start();
//         thread3.start();
//         thread4.start();
//         thread5.start();
//         thread6.start();
//         thread7.start();
//         thread8.start();
//         thread9.start();
//         thread10.start();
//         thread11.start();
//         thread12.start();
//         thread13.start();
//         thread14.start();
//         thread15.start();
//         thread16.start();


	}
}
