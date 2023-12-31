package cgg.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
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
		
		boolean isExists = list.stream().anyMatch(element->element.contains("e"));
		System.out.println("req:" +isExists);
		
		Stream<Student> parallelStream = stuList.parallelStream();
		System.out.println("Student data send for processing.......");
		parallelStream.forEach(s->doProcess(s)); //Order is not maintained while traversing since multiple threads are running parallel
		
		//Creating Empty Stream
		Stream<String> empty= Stream.<String>empty(); //It is a new method of creating new object specifying desired type before the method
		System.out.println("This is empty stream");
		empty.forEach(System.out::println); //since it is an empty stream it prints nothing
		
		
		//creating stream using Builder
		System.out.println("--------------------------");
		Stream<String> builder = Stream.<String>builder().add("DD").add("G").add("UU").build();
		builder.forEach(System.out::println);
		
		//Creating stream using Generate
		System.out.println("--------------------------");
		Stream<String> limit = Stream.generate(()->"Heloo").limit(10);
		limit.forEach(System.out::println);
		
		
		//Creating stream using Iterate:
		Stream<Integer> limit2 = Stream.iterate(40, i->i+2).limit(10);
		limit2.forEach(System.out::println);
		//Infinite and generate creates infinite streams
		
		//Stream of primitives- only int,long,double primitive types are possible:
		//For this new interfaces are used- IntStream, LongStream, DoubleStream
		System.out.println("-----------------------------------");
		IntStream range = IntStream.range(1, 6);//excludes 6
		range.forEach(System.out::println);
		
		System.out.println("----------------------------------");
		IntStream rangeClosed = IntStream.rangeClosed(1,6);//includes 6
		rangeClosed.forEach(System.out::println);
		
		System.out.println("-----------------------------");
		LongStream range2 = LongStream.range(1, 10);
		range2.forEach(System.out::println);
		
	    System.out.println("-----------------------------------");
	    Random random=new Random();
	    DoubleStream doubles=random.doubles(5);
	    doubles.forEach(System.out::println);
		
	    
	    System.out.println("------------------------------------");
	    IntStream chars="abcd".chars(); //here sting is stored in IntStream
	    chars.forEach(System.out::println);
		
	
}

	private static void doProcess(Student s) {
		System.out.println(s);
		
	}
	//Massive amount of data for processing, going for parallelStream is a good option
	//Order of iteration is not maintained
	//Makes use of multi-thread and multi-core processor
}
