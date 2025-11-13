package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Limitelementsvtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		limitElements();
		
		List<Integer>ip = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19);
		
		limitElements(ip);

	}
	
	public static void limitElements () {
		
		List<Integer>output = Stream.generate(new Random()::nextInt)
					.limit(4)
					.collect(Collectors.toList());
		
		System.out.println(output);
		
		return;
	}
	
	public static void limitElements(List<Integer>input) {
		
		List<Integer>output = input.stream()
				.limit(10)
				.collect(Collectors.toList());
		
		System.out.println(output);
		
		return;
	}

}
