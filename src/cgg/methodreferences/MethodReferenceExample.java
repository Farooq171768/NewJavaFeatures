package cgg.methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceExample {

	public static void main(String[] args) {
		// ExecutorService executorService = Executors.newSingleThreadExecutor();
		// Runnable r=()->System.out.println("My task is running.");
		// Runnable r=MethodReferenceExample::myRun;
		// executorService.execute(r);

		List<Integer> numbers = Arrays.asList(4, 9, 45, 23, 454, 235);
		numbers.forEach(System.out::println);

		System.out.println("---------------------------------------");

		List<Double> findSquareRoots = MethodReferenceExample.findSquareRoots(numbers, Double::new);
		// List<Double>
		// findSquareRoots=MethodReferenceExample.findSquareRoots(numbers,x->new
		// Double(x));
		findSquareRoots.forEach(System.out::println);

		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("ABC", 20));
		persons.add(new Person("DEF", 21));
		persons.add(new Person("GHI", 23));
		persons.add(new Person("JKL", 26));
		persons.add(new Person("MNO", 29));

		// persons.forEach(System.out::println);
		System.out.println("-----------------------------");
		List<String> personNames = MethodReferenceExample.getPersonName(persons, Person::getName);
		// List<String>
		// personNames=MethodReferenceExample.getPersonName(persons,p->p.getName());
		personNames.forEach(System.out::println);
		System.out.println("--------------");

		// PersonManager pm=()->new Person();
		PersonManager pm = Person::new;
		System.out.println(pm.getPerson().getPersonInfo());

	}

	private static List<String> getPersonName(List<Person> persons, Function<Person, String> f) {
		List<String> result = new ArrayList<String>();
		persons.forEach(p -> result.add(f.apply(p)));
		return result;
	}

	private static List<Double> findSquareRoots(List<Integer> numbers, Function<Integer, Double> f) {
		List<Double> result = new ArrayList<Double>();

		numbers.forEach(x -> result.add(Math.sqrt(f.apply(x))));

		return result;
	}

	private static void myRun() {
		System.out.println("My task is running.");
	}

}
