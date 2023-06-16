package cgg.closure;

public class ClosureExample {

	public static void main(String[] args) {
		int x=30;
		int y=40; //local variable
		
		
		//ANONYMOUS CLASS:
//		doOperate(x,new Operation(){
//			
//			@Override
//			public void operate(int i) {
//				//x=300;
//				System.out.println(i+y);
//			}
//		});
		
		
		//LAMBDA EXPRESSION:
		doOperate(x,n->{
			//y=20; This will gives compilation error Since it is a closure.
			System.out.println(n+y);
		});

	}
	
	private static void doOperate(int i,Operation o) {
		o.operate(i);
		
	}

}
