package sef.module10.sample;
//Needs to be completed
public class MyThreadClient {
	public static void main(String args[]) {
		
			System.out.println("Thread Name :" + Thread.currentThread().getName());
		
			//1 - Instantiate two objects of MyThread class and pass Thread name as its parameter 
			MyThread m1 = new MyThread("My Thread One",10);
			MyThread m2 = new MyThread("My Thread Two",10);
			
			//2 - start both the threads using start()
			m1.start();
			m2.start();
		}
	
}
