package com.cs.demos;

import java.io.IOException;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.StringTokenizer;

public class sampl {
	
	public static void main(String[]args) throws IOException{
StringTokenizer st=new StringTokenizer("sajal is goy-al "," ");
while(st.hasMoreTokens()){
	System.out.println(st.nextToken());
}
		double f1 = .0;
	    for (int i = 1; i <= 11; i++) {
	        f1 += .1;
	    }
	 
	    //Method 2
	    double f2 = .1 * 11;
	 
	    System.out.println("f1 = " + f1);
	    System.out.println("f2 = " + f2);



	
	}
}


class g implements UncaughtExceptionHandler{
	@Override
	public void uncaughtException(Thread t,Throwable k){
		
	}
}

class k extends Thread
{
	k(String name){
		super(name);
	}
	
	@Override
	public void start(){
		
		run();
	}
	
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getState());
	System.out.println("sajal is best");	
	}
}
class sam1 implements Runnable{
	int a=10;
	public sam1(int m){
		this.a=m;
	}
	public void run(){
		int m=10;
		System.out.println("sajal is best");
	}
}

@FunctionalInterface
interface Supplier<Integer>{
	public Integer get();
}

