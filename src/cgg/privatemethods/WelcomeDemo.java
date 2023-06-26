package cgg.privatemethods;

public class WelcomeDemo implements Welcome{

	public static void main(String[] args) {
		WelcomeDemo welcome = new WelcomeDemo();
		welcome.hi();
		welcome.greet();
		Welcome.test();
		

	}

	@Override
	public void hi() {
		System.out.println("Hi");
		
	}

}
