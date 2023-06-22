package cgg.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import cgg.comparator.Employee;

public class FunctionIdentityExample {

	public static void main(String[] args) {
		 List<Employee> employeeList = Arrays.asList(
				 new Employee("Tom Jones", 45),
				 new Employee("Harry Major", 25),
				 new Employee("Ethan Hardy", 65),
				 new Employee("Nancy Smith", 15),
				 new Employee("Deborah Sprightly", 29));
		 List<Employee> empNameListInitials = applyIdentityToEmpList(employeeList, Function.identity());
		 empNameListInitials.forEach(System.out::println);
	}

	private static List<Employee> applyIdentityToEmpList(List<Employee> employeeList, Function<Employee, Employee> identity) {
		List<Employee> empNameList = new ArrayList<Employee>();
		//t -> t
		for (Employee emp : employeeList) {
			empNameList.add(identity.apply(emp));
		}
		return empNameList;
		
	}

}
