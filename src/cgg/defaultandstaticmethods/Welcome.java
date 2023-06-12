package cgg.defaultandstaticmethods;

public class Welcome implements i1,i2 {

//	@Override
	public void display() {
//		System.out.println("Hello");
		i2.super.display();
	}
	
	public static void main(String[] args) {
		Welcome welcome = new Welcome();
		welcome.display();
	}
}
