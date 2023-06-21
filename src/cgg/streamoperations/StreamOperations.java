package cgg.streamoperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import cgg.streamapi.Student;

public class StreamOperations {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("fsr");
		list.add("dgt");
		list.add("gtd");
		list.add("ftt");
		
		Stream<String> stream= list.stream(); //intermediate opertion
		Stream<String> distinct = stream.distinct(); //intermediate opeation
		long count = distinct.count(); //terminal operation
		System.out.println(count);
		
		//Output will be 4, since there are distinct string elements in 'list'
		
		long count2 = list.stream().count(); //chaining the above code
		System.out.println(count2);
		
		//Once a stream is called on  with a terminal it gives error i.e that Streams cannot be reused. 
		
		boolean anyMatch = list.stream().anyMatch(e->e.contains("tr"));
		System.out.println(anyMatch);
		
		System.out.println("-----------------------------------------");
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("PK",23));
		stuList.add(new Student("RK",20));
		stuList.add(new Student("SK",21));
		stuList.add(new Student("NK",24));
		stuList.add(new Student("DK",22));
		
		
		Stream<Student> filteredList=stuList.stream().filter(e->e.getAge()>20);
		filteredList.forEach(System.out::println);
		
		System.out.println("----------------------------------------------");
		boolean allMatch=stuList.stream().allMatch(s->s.getName().contains("K"));
		System.out.println(allMatch);
		
		System.out.println("--------------------------------------");
		boolean anyMatch1=stuList.stream().anyMatch(s->s.getAge()>39);
		System.out.println(anyMatch1);
		
		System.out.println("--------------------------------------");
		boolean noneMatch=stuList.stream().noneMatch(s->s.getAge()>39);
		System.out.println(noneMatch);
	}

}
