package cgg.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationExample {

	public static void main(String[] args) {
		
		System.out.println("First Technique of creation of stream:Arrays as source");
		String [] arr= {"ABC","PQR","STU","jhfs"};
		Stream<String> stream=Arrays.stream(arr);
		
		stream.forEach(System.out::println);//internal iteration of stream
		
		System.out.println("----------------------");
		System.out.println("Second Technique of creation of stream:Individual elements as source using of");
		Stream<String> of=Stream.of("a","c","e","d");
		of.forEach(System.out::println);
		
		
		System.out.println("----------------------");
		System.out.println("Third Technique of creation of stream:Collection as source");
		List<String> list= new ArrayList<>();
		list.add("qwe");
		list.add("der");
		list.add("efk");
		list.add("vfh");
		list.add("nhu");
		
		Stream<String> stream2 = list.stream();
		stream2.forEach(System.out::println);
		

		System.out.println("----------------------");
		//Parallel Stream:
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("PK",21));
		stuList.add(new Student("AK",20));
		stuList.add(new Student("DK",25));
		stuList.add(new Student("SK",30));
		stuList.add(new Student("RK",22));
		stuList.add(new Student("LK",28));
		
		Stream<Student> parallelStream = stuList.parallelStream();
		System.out.println("Student data send for processing.......");
		parallelStream.forEach(s->doProcess(s)); //Order is not maintained while traversing since multiple threads are running parallel
}

	private static void doProcess(Student s) {
		System.out.println(s);
		
	}
	//Massive amount of data for processing, going for parallelStream is a good option
	//Order of iteration is not maintained
	//Makes use of multi-thread and multi-core processor
}
