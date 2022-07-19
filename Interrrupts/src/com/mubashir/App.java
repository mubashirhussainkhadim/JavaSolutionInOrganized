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
			    	 System.out.println("Orignal Balance: "+balance);
			    	 System.out.println("Widthram AMOUNT: " + amount);
			    	 balance = balance  - amount;
			    	 System.out.println("Withdrwal Sucessful and the current balance is: "+balance);
				} 
    		 } else {
    			 System.out.println("We are Inside else");
    		 }
    		 }
     }
     public void deposit(int amount) {
    	 System.out.println("WE are depositing the amount:  " + amount);   
    	 balance = balance + amount;
     }
	public static void main(String[] args) {
      App app = new App();
      Thread thread1 = new Thread(new Runnable() {

		@Override
		public void run() {
          app.withdraw(1000);			
		}
    	  
      }); 
      
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
          		thread1.interrupt();
		}
    	  
      });
    thread2.start(); 
      
      }

}
