package cgg.privatemethods;

public interface Welcome {

	void hi();
	default void greet() {
		System.out.println("Inside default greet method");
		welcome();
		welcome2();
	}
	public static void test() {
		System.out.println("Test");
		welcome();
		
	}
	
	private static void welcome() {
		System.out.println("Welcome to Java9");
	}
	private void welcome2() { //only can be called from default method since it is non static
		System.out.println("Welcome again to Java9");
	}
}
