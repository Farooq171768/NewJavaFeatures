package cgg.functionalinterface;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {
			BiPredicate<Integer,String> biPredicate= (i,o)->i>20&&o.startsWith("M");
			
			System.out.println(biPredicate.test(30, "Sean"));
			System.out.println(biPredicate.test(40, "Martin"));
			System.out.println(biPredicate.test(10, "Frank"));
			System.out.println("----------------------------------");
			
			
			
			BiPredicate<Integer,Integer> biPredicate1= (i,o)->i>20&&o>20;
			
			System.out.println(biPredicate1.test(30, 10));
			System.out.println(biPredicate1.test(40, 40));
			System.out.println(biPredicate1.test(10, 30));

		}


	}

