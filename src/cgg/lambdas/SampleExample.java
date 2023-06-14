package cgg.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SampleExample {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Farooq","MD",22),
				new Person("Raj","Shekar",21),
				new Person("Mohan","Amrutham",22),
				new Person("Akash","Kasturi",21),
				new Person("Sadiq","MD",20));
		
		
		//Step-1: Sort list by last name:
		Collections.sort(people, (p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
		
		//Step-2: Create a method that prints all the elements in the list:
		System.out.println("Printing all persons:");
		//printAll(people);
		
		//Step-3: Create a method that prints all persons with last name beginning with "M":
		System.out.println("---------------------------------------------------");
		System.out.println("People with last name starting with 'M'");
		printConditionally(people,p->p.getLastName().startsWith("M"),System.out::println);
		
		System.out.println("----------------------------------------------------");
		System.out.println("Printing all persons with first name starting with 'F'");
		printConditionally(people,p->p.getFirstName().startsWith("F"),System.out::println);
		System.out.println("----------------------------------------------------");
		printConditionally(people,p->true,System.out::println);
		
		
	}
//	private static void  printAll(List<Person> person) {
//		for (Person person2 : person) {
//			System.out.println(person2);
//		}
//	}
	private static void printConditionally(List<Person> persons,Predicate<Person> predicate,Consumer<Person> consumer) {
		
		for (Person person : persons) {
			if(predicate.test(person)) {
				consumer.accept(person);
			}
		}
	}

}
