package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Converttoset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>a = Arrays.asList(5,5,7,12,6,6,6,6,10,10,10);
		
		convertToSet(a);

	}
	
	public static void convertToSet (List<Integer>input) {
		
		Set<Integer>output = input.stream()
									.collect(Collectors.toSet());
		
		System.out.println(output);
		
		return;
	}

}
