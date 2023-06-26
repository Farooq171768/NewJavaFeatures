package cgg.collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapForEachExample {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<>();
		
		for (int i = 1; i < 101; i++) {
			hashMap.put(i, "person_"+i);
		}
		//ForEach with single thread
		hashMap.forEach((key,val)->{
			System.out.println("Thread:"+Thread.currentThread().getName());
			
			System.out.println(key+"\t"+val);
		});
		
		System.out.println("----------------------------------------------------------");

		//ForEach with threshold number of threads
		hashMap.forEach(3,(key,val)->{
			System.out.println("Thread:"+Thread.currentThread().getName());
			
			System.out.println(key+"\t"+val);
		});
	}
	

}
