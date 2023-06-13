package cgg.lambdas;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaExample {

	public static void main(String[] args) {

		lambdaWithZeroParam();
		System.out.println("--------------------");

		anonymousClassZeroParam();
		System.out.println("-------------------------");

		lambdaWithOneParam();
		System.out.println("---------------------");

		lambdawithMultiParam();
		System.out.println("------------------");

		lambdaWithParamsAndReturnType();
		System.out.println("------------------");

		lambdaAdd2Numbers();
		System.out.println("------------------");

		lambdaToLenOfStr();
		System.out.println("----------------------");

		lambdaDoubleANum();
		System.out.println("----------------------");

		lambdaToDivide();
		System.out.println("--------------------");

		lambdawithInterfaceAsArgument();
		System.out.println("--------------------");

		ArrayList<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee("Farooq", "abc@gamil.com", 35000.0));
		emplist.add(new Employee("RajShekar", "raj@gamil.com", 25000.0));
		emplist.add(new Employee("Sanjeeva", "der@gamil.com", 45000.0));
		emplist.add(new Employee("Ajay", "cgf@gamil.com", 75000.0));
		emplist.add(new Employee("Vamshi", "uyt@gamil.com", 55000.0));
		emplist.add(new Employee("Sharooq", "iug@gamil.com", 95000.0));

		System.out.println("List before sorting:");
		for (Employee emp : emplist) {
			System.out.println(emp);
		}
		System.out.println("------------------------------------------------------------------");
		System.out.println("List after sorting based on names");

		Collections.sort(emplist, (e1, e2) -> e1.getName().compareTo(e2.getName()));

		for (Employee emp : emplist) {
			System.out.println(emp);
		}
		System.out.println("------------------------------------------------------------------");

		System.out.println("List after sorting based on salary");

		Collections.sort(emplist, (e1, e2) -> (int) (e1.getSalary() - e2.getSalary()));

		for (Employee emp : emplist) {
			System.out.println(emp);
		}

	}

	private static void lambdawithInterfaceAsArgument() {
		Foo f = () -> System.out.println("Im with Interface as argument");
		// f.perform();
		doPerform(f);

	}

	private static void doPerform(Foo f) {// Here Foo f is an Lambda Expression,it is passed as argument
		f.perform();

	}

	private static void lambdaToDivide() {
		SafeDivide i7 = (m, n) -> {
			if (n == 0) {
				return 0;
			}
			return m / n;
		};

		System.out.println("Division is: " + i7.divide(6, 3));
		System.out.println("Division is: " + i7.divide(6, 0));

	}

	private static void lambdaDoubleANum() {
		DoubleANum i6 = n -> n * 2;
		System.out.println("Double of a number is: " + i6.dub(6));

	}

	private static void lambdaToLenOfStr() {
		LengthOfString i5 = n -> n.length();
		System.out.println("Length of str: " + i5.len("CGG"));

	}

	private static void lambdaAdd2Numbers() {
		Adding2Numbers a1 = (m, n) -> m + n;
		System.out.println("Sum is " + a1.add(3, 5));

	}

	private static void lambdaWithParamsAndReturnType() {
		MyInterface4 i4 = (a1, a2) -> a1 > a2;
		System.out.println(i4.test(1, 2));
		System.out.println(i4.test(4, 2));

	}

	private static void lambdawithMultiParam() {
		MyInterface3 i3 = (m, n, p) -> {
			System.out.println("Your name is: " + m);
			System.out.println("Your age is: " + n);
			System.out.println("Your salary is: " + p);
		};
		i3.method3("Farooq", 22, 20000.0);
	}

	private static void lambdaWithOneParam() {
		// defining lambda
		MyInterface2 i2 = name -> System.out.println("Hello " + name);
		// Calling lambda
		i2.method2("ABC");

	}

	private static void lambdaWithZeroParam() {
		// Defining lambda or implementing interface
		MyInterface1 i1 = () -> System.out.println("Lambda with zero parameters...");
		// Calling lambda
		i1.method1();
	}

	private static void anonymousClassZeroParam() {
		MyInterface1 i1 = new MyInterface1() {

			@Override
			public void method1() {
				System.out.println("Anonymous class...");

			}

		};
		// calling anonymous function
		i1.method1();

	}

}
