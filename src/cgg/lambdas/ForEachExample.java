package cgg.lambdas;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Farooq","MD",22),
				new Person("Raj","Shekar",21),
				new Person("Mohan","Amrutham",22),
				new Person("Akash","Kasturi",21));
		//External ITERATORS->Controlled by programmers->slow
		System.out.println("Iterating using for loop");
		for(int i=0;i<people.size();i++) {
			System.out.println(people.get(i));
		}
		System.out.println("------------------------");

		
		
		System.out.println("Iterating using for in loop");
		for (Person person : people) {
			System.out.println(person);
		}
		System.out.println("------------------------");
		
		//INTERNAL ITERATORS:We have no control,JVM control it,can execute in parallel also->fast
		System.out.println("Iterating using lambda");
		people.forEach(p->System.out.println(p));
		System.out.println("------------------------");
		
		System.out.println("Iterating using method references");
		people.forEach(System.out::println);
	}

}
