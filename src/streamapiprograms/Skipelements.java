package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Skipelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>a = Arrays.asList(56,57,58,59,60,61,62,63,64,65);
		
		skipElements(a);

	}
	
	public static void skipElements (List<Integer>input) {
		
		List<Integer>output = input.stream()
								.skip(2)
								.collect(Collectors.toList());
		
		output.forEach(num -> System.out.print(num+" "));
		System.out.println();
		
		return;
	}

}
