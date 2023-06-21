package cgg.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparingIntExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Carter","James","Davis","Zola","Barry","Zorra");
		System.out.println("Before sorting:");
		list.forEach(System.out::println);
		System.out.println("---------------------------");

		Comparator<String> comp = Comparator.comparingInt(String::length);
		Collections.sort(list,comp);
		System.out.println("After sorting:");
		list.forEach(System.out::println);

		
		
	}

}
