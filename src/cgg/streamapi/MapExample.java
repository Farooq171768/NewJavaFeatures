package cgg.streamapi;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapExample {

	public static void main(String[] args) {
		List<String> uris= new ArrayList<>();
		uris.add("C://MyFile1.txt");
		uris.add("D://MyFile2.txt");
		uris.add("C://MyFile3.txt");
		uris.add("D://MyFile4.txt");
		
		Stream<Path> map = uris.stream().map(uri->Paths.get(uri)); //here path is taking argument of strings and returning a type of path
		map.forEach(System.out::println);
		
		System.out.println("------------------------------------");
		List<Details> details= new ArrayList<>();
		
		List<String> parts1= new ArrayList<>();
		parts1.add("Parts_1");
		parts1.add("Parts_2");
		parts1.add("Parts_3");
		
		List<String> parts2= new ArrayList<>();
		parts2.add("Parts_1");
		parts2.add("Parts_2");
		parts2.add("Parts_3");
		parts2.add("Parts_4");
		
		
		Details detais1 = new Details(1001,parts1);
		Details details2 = new Details(1002,parts2);
		
		details.add(detais1);
		details.add(details2);
		
		Stream<String> flatMapStream = details.stream().flatMap(d->d.getParts().stream());
		flatMapStream.forEach(System.out::println);
	
	
	}

}
