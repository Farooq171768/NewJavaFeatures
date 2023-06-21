package cgg.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceExample {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,1,1,1);
		Integer reduce = integers.stream().reduce(0,(a,b)->a+b);
		System.out.println(reduce);

		
		System.out.println("------------------------------");
		
		
		List<String> names= new ArrayList<>();
		names.add("aaa");
		names.add("bbb");
		names.add("ccc");
		names.add("ddd");
		
		
		List<String> collect = names.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
