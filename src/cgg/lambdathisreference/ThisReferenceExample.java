package cgg.lambdathisreference;

public class ThisReferenceExample {
	
	public void process() {
		doOperate(30,n->{
			System.out.println(30+n);
			System.out.println(this);
		});
	}

	public static void main(String[] args) {
		int b=30;
		
    	//ANONYMOUS CLASS:
		ThisReferenceExample.doOperate(b, new Operation() {

			@Override
			public void operate(int i) {
				System.out.println(b+i);
				System.out.println(this);
				
			}
			
		});
		
		//LAMBDA EXPRESSION:
		doOperate(b,n->{
			System.out.println(b+n);
			//System.out.println(this);
		});

		new ThisReferenceExample().process();
	}
	private static void doOperate(int i,Operation o) {
		o.operate(i);
	}

}
