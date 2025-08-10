package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinctelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>a = Arrays.asList(1,1,2,3,3,3,4,4,4,4,5);
		
		distinctElements(a);

	}
	
	public static void distinctElements (List<Integer>input) {
		
		List<Integer>output = input.stream()
									.distinct()
									.collect(Collectors.toList());
		
		output.forEach(num -> System.out.print(num+" "));
		
		System.out.println();
		
		return;
	}

}
