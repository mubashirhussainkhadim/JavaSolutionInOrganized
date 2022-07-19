package com.mubashir;

public class App {
   volatile public static int var =0;
	public static void main(String[] args) {
       new Thread(new Runnable() {

		@Override
		public void run() {
                while(true) {
                	if(var == 0) {
                	System.out.println("Running )");
                }else {
                	break;
              }
             }
		    }
    	   
          }).start();
         new Thread(new Runnable() {

	   	@Override
	   	public void run() {
  			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  			App.var =1;
  			System.out.print("VAr value Updated ");
		   }
    	   
           }).start();
	      }

      }
