package streamapiprogramsvthree;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Limitelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>a = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		limitElements(a);
		
		limitIntegers();

	}
	
	public static void limitElements (List<Integer>input) {
		List<Integer>output = input.stream().limit(6)
						.collect(Collectors.toList());
		
		System.out.println(output);
		
		return;
	}
	
	public static void limitIntegers () {
		
		List<Integer>output = Stream.generate(new Random()::nextInt)
		 		.limit(4)
		 		.collect(Collectors.toList());
		
		System.out.println(output);
		
		return;
		
	}


}
