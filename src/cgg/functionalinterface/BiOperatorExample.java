package cgg.functionalinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

public class BiOperatorExample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String,String>();
		
		map.put("A", "X");
		map.put("B", "Y");
		map.put("C", "Z");

		BinaryOperator<String> binaryOpt=(s1,s2)->s1+"-"+s2;
		binaryOperatorFun(binaryOpt,map).forEach(System.out::println);
	}

	private static List<String> binaryOperatorFun(BinaryOperator<String> binaryOpt, Map<String, String> map) {
		List<String> biList= new ArrayList<>();
		map.forEach((s1,s2)->biList.add(binaryOpt.apply(s1, s2)));
		return biList;
	}

}
