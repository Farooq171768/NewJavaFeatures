package cgg.lambdaexceptionhandling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExceptionHandlingExample {

	public static void main(String[] args) {
//		List<Integer> integers = Arrays.asList(3,8,1,12,45);
		List<Integer> integers = Arrays.asList(3,0,8,1,12,45);
//		integers.forEach(i->{
//			try {
//				System.out.println(50/i);
//			} catch (ArithmeticException e) {
//				System.out.println("Arithmetic Exception occurred: "+e.getMessage());
//			}
//		});
		integers.forEach(lambdaWrapper(i->System.out.println(50/i),Exception.class));
		//LambdaExceptionHandlingExample.lambdaWrapper(i->System.out.println(50/i))
		
	}
		
		private static <T,E extends Exception> Consumer<T> lambdaWrapper(Consumer<T> consumer,Class<E> c){
			return i->{
				try {
					consumer.accept(i);
				}
				catch(Exception e) {
					System.out.println("Arithmetic Exception occurred: "+e.getMessage());
				}
			
		};
		}
		
		
	}

