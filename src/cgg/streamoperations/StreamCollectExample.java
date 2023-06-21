package cgg.streamoperations;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollectExample {

	public static void main(String[] args) {
		List<Product> productList= Arrays.asList(new Product(23,"Potatoes"),
				new Product(14,"Orange"),
				new Product(13,"Lemon"),
				new Product(23,"Bread"),
				new Product(12,"Sugar"));
		
		//method1(productList);
		
		//Summarizing Price statistics:
		IntSummaryStatistics collect = productList.stream().collect(Collectors.summarizingInt(Product::getPrice));
		System.out.println(collect);
		System.out.println("----------------------------------");
		
		//Group by:
		Map<Integer,List<Product>> collect2 = productList.stream().collect(Collectors.groupingBy(Product::getPrice));
		collect2.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
		System.out.println("-----------------------------------");
		
		//Dividing stream's elements into groups according to some predicate:
		Map<Boolean,List<Product>> collect3 = productList.stream().collect(Collectors.partitioningBy(p->p.getPrice()>15));
		collect3.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
		System.out.println("-----------------------------------");
		
		
		//Pushing the collector to perform additional transformation:
		Set<Product> collect4 = productList.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet));
		collect4.forEach(System.out::println);
		
		
	}

	private static void method1(List<Product> productList) {
		//Convert stream to collection
		List<String> collect = productList.stream().map(Product::getName).collect(Collectors.toList());
		collect.forEach(System.out::println);
		System.out.println("------------------------------------");
		
		//Reduce to string:
		String collect2 = productList.stream().map(Product::getName).collect(Collectors.joining(",","[","]")); //delimitor,prefix and suffix
		System.out.println(collect2);
		System.out.println("------------------------------------");
		
		//Average price:
		Double collect3 = productList.stream().collect(Collectors.averagingInt(Product::getPrice));
		//Double collect3 = productList.stream().collect(Collectors.averagingInt(p->p.getPrice));
		System.out.println(collect3);
	}

}
