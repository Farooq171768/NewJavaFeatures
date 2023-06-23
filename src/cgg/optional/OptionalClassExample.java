package cgg.optional;

import java.util.Optional;

public class OptionalClassExample {
	
	public static Optional<String>getName(){
		String name=null;
		return Optional.ofNullable(name);
	}

	public static void main(String[] args) {
		String str= "jybcgfvo";
		
		Optional<String> ofNullable = Optional.ofNullable(str);
		System.out.println(ofNullable.isPresent());
		//System.out.println(ofNullable.get());
		
		System.out.println(ofNullable.orElse("No value in the object"));
		
		Optional<String> name= getName();
		System.out.println(name.orElse("NUll Return"));

	}

}
