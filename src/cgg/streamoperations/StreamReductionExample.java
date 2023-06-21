package cgg.streamoperations;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamReductionExample {

	public static void main(String[] args) {
		//First form or variant of reduce:
		OptionalInt reduce = IntStream.range(1, 4).reduce((a,b)->a+b); //reduce taking only combiner
		System.out.println(reduce.getAsInt());
		System.out.println("---------------------------------");
		

		//Second form or variant of reduce:
		int reduce2 = IntStream.range(1,4).reduce(10,(a,b)->a+b); //reduce taking identity and combiner
		System.out.println(reduce2);
		System.out.println("---------------------------------");
		
		//Third form or variant of reduce:
		Integer reduce3 = Arrays.asList(1,2,3).parallelStream().reduce(10,(a,b)->a+b,(a,b)->{ //here reduce is taking 3 arguments identity,accumulator and combiner
			System.out.println("Combiner called");
			return a+b;
		});
		//10+1,10+2,10+3
		//11,12,13
		//11,12+13 ->combiner call
		//11+25    ->combiner called again
		//36
		System.out.println(reduce3);
		
		
		
	}

}
