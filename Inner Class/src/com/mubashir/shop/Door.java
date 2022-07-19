package com.mubashir.shop;

public class Door {
   private Lock lock;
   public Door() {
	   lock = new Lock(true);
	   
   }
   
   public Lock getLock() {
	return lock;
}

public void shopeState() {
	   if (lock.isLock()) {
		   System.out.println("Shop is Closed , please visit later");
	   }
	   else {
		   System.out.println("Shope is open ,Wellcome"); 
	   }
   }
   public class Lock {
	   private boolean lock;
	   
	   public Lock(boolean lock) {
		   this.lock = lock;
	   }
	  public boolean isLock() {
		return lock;
	}
	public void setLock(boolean lock) {
		this.lock = lock;
	}
	   
   }
   
}
