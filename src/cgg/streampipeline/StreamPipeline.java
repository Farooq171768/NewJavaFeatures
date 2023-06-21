package cgg.streampipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPipeline {

	public static void main(String[] args) {
		Stream<String> onceModifiedStream = Stream.of("abc","bbcd","cbcd").skip(1); //it skips first element-abc
		onceModifiedStream.forEach(System.out::println);

		System.out.println("----------------------------");
		Stream<String> stream = Stream.of("abc1","bbcd2","cbcd3");
		Stream<String> twiceModifiedStream = stream.skip(1).map(e->e.substring(0,3));
		twiceModifiedStream.forEach(System.out::println);
		
		System.out.println("-------------------------------");
		List<String> list = Arrays.asList("abc1","abc2","abc3","abc4");
		long count = list.stream().skip(1).map(s->s.substring(0,3)).sorted().count(); //Pipelining
		System.out.println(count);
		
		
		
	}

}
