package com.mubashir;
class MyCounter extends Thread{
	private int threadNo;

	public MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}
	public void countMe(){
		for(int i=1; i <= 9 ; i ++ ) {
			try {
				sleep(500); 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value if i: "+i+" and the THread Number is: " + threadNo);
		}
	}
	@Override 
	public void run() {
		countMe();
	}
}
public class App {

	public static void main(String[] args) throws InterruptedException {
         MyCounter counter1 = new MyCounter(1);
         MyCounter counter2 = new MyCounter(2);
         
         long startTime =System.currentTimeMillis();
         counter1.start(); //RUN should be called by JVM
         System.out.println("******************");
         counter2.start();
 
			Thread.sleep(5000);
		
         long endTime =System.currentTimeMillis();
         System.out.println("Total time required to process: "+ (endTime-startTime));

	} 

}
