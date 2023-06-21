package cgg.streamoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamExample {

	public static void main(String[] args) {
		List<Product> productList= Arrays.asList(new Product(23,"Potatoes"),
				new Product(14,"Orange"),
				new Product(13,"Lemon"),
				new Product(23,"Bread"),
				new Product(12,"Sugar"));	
		
		//1.Creating parallel stream from collections.
		Stream<Product> streamCollection = productList.parallelStream();
		boolean parallel = streamCollection.isParallel(); //mandatory operation in parallel stream
		System.out.println(parallel);
		boolean bigPrice = streamCollection.map(product->product.getPrice()*12)
						.anyMatch(price->price>200);
		System.out.println(bigPrice);
		System.out.println("-------------------------");
		
		//2.Creating parallel stream from IntStream,LongStream and DoubleStream:
		IntStream intStreamParallel = IntStream.range(1, 150).parallel();
		boolean parallel2 = intStreamParallel.isParallel();
		System.out.println(parallel2);
		System.out.println("-------------------------------");
		
		
		//3.Convert stream from parallel to sequential mode:
		IntStream intStreamSequential = intStreamParallel.sequential();
		boolean parallel3 = intStreamSequential.isParallel();
		System.out.println(parallel3);
		System.out.println("-------------------------");

		
		

	}

}
