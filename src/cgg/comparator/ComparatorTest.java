package cgg.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		List<Employee> empList= new ArrayList<>();
		
		empList.add(new Employee("Davis",30));
		empList.add(new Employee("Alice",23));
		empList.add(new Employee("Barry",34));
		empList.add(new Employee("Martin",35));
		empList.add(new Employee("James",45));
		
		
		System.out.println("Before sorting:");
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		Collections.sort(empList, (e1, e2) -> e1.getName().compareTo(e2.getName()));

		System.out.println("After sorting:");
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		
		
		
		
		

	}

}
