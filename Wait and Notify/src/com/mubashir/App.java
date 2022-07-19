package com.mubashir;

public class App {
	 static public int balance = 0;
     public void withdraw( int amount) {
    	 synchronized (this)
    		 {if (balance <= 0) {
    			 try {
    				System.out.println("Waiting for the balance updation");
					wait(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
    		 }
    		 }
    	 balance = balance  - amount;
    	 System.out.println("Withdrwal Sucessful and the current balance is: "+balance);
     }
     public void deposit(int amount) {
    	 System.out.println("WE are depositing the amount");   
    	 balance = balance + amount;
    	synchronized(this) { notifyAll();}
     }
	public static void main(String[] args) {
      App app = new App();
      Thread thread1 = new Thread(new Runnable() {

		@Override
		public void run() {
          app.withdraw(1000);			
		}
    	  
      });
      thread1.setName("Thread1");
      thread1.start(); 
      Thread thread2 = new Thread(new Runnable() {

		@Override
		public void run() {
          		try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
          		app.deposit(2000 );
		}
    	  
      });
      thread2.setName("Thread1");
      thread2.start(); 
      
      }

}
