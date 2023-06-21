package cgg.comparator;

import java.util.ArrayList;
import java.util.List;

public class ListComparatorExample {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee("Davis", 30));
		empList.add(new Employee("Alice", 23));
		empList.add(new Employee("Barry", 34));
		empList.add(new Employee("Martin", 35));
		empList.add(new Employee("James", 45));
		
		System.out.println("Before sorting:");
		empList.forEach(System.out::println);
		
		System.out.println("After sorting:");
		empList.sort((e1,e2)->e1.getName().compareTo(e2.getName()));
		empList.forEach(System.out::println);

	}

}
