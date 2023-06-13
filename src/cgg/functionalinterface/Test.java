package cgg.functionalinterface;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		//createThreadUsingAnonymousClass();
		
		//createThreadUsingLambda();
		//createCustomLambda();
		
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Delhi");
		list.add("Hydrabad");
		list.add("Chennai");
		list.add("Banglore");
		
		//method references
		list.forEach(System.out::println);
		
		//Lambda
		list.forEach(n->System.out.println(n));

	}

	private static void createCustomLambda() {
		
		//Defining lambda
		MyInterface i=name->System.out.println("Welcome to "+name);;
		
		//Invoking Lambda
		i.meth1("CGG");
		
	}

	private static void createThreadUsingLambda() {
		//Lambda expression
	
		Runnable r=()->System.out.println("My Runnable .....");
		
		Thread thread= new Thread(r);
		thread.start();
		
	}

	private static void createThreadUsingAnonymousClass() {
//		Runnable r= new Runnable() {
//
//			
//			//Anonymous Class
//			@Override
//			public void run() {
//				System.out.println("I am thread my task is executing......");
//				
//			}
//			
//		};
//		
//		
//		Thread thread= new Thread(r);
//		thread.start();
}

}
