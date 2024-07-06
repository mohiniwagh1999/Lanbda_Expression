package com.g.lambda;

public class ThreadLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Runnable thread1=()->{
    for(int i=0;i<10;i++)
    {
    	System.out.println("value of i"+i);
     try {
		Thread.sleep(1000);
	} 
    catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
	
	};
    
	Thread t=new Thread(thread1);
	t.setName("john");
	t.start();

}
}
