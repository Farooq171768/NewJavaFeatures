package cgg.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapComputeMethodExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "Java");
		map.put(2, "Java");
		
		System.out.println("Original map: " + map);
		
		// recompute the values:- compute to concatinate value
		map.compute(1, (key, oldVal) -> oldVal.concat("Script"));
		map.compute(2, (key, oldVal) -> oldVal.concat("FrameWork"));
		System.out.println("Recomputed map: " + map);
		
		// return "null" to remove value:- compute remove entry itself
		String r1 = map.compute(1, (key, oldVal) -> null);
		System.out.println(r1);
		System.out.println("modified map: " + map);
		
		// null for does nothing:
		String r2 = map.compute(3, (key, oldVal) -> null);
		System.out.println(r2);
		System.out.println("re-modified map: " + map);
		
		String r3 = map.compute(30, (key, oldVal) -> "Spring Framework");
		System.out.println(r3);
		System.out.println("After null: " + map);

	}

}
