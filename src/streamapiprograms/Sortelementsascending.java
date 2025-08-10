package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sortelementsascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>a = Arrays.asList(8,4,7,6,3,10,3,9);
		
		sortElements(a);

	}
	
	public static void sortElements (List<Integer>input){
		
		List<Integer>output = input.stream()
								.sorted()
								.collect(Collectors.toList());
		
		output.forEach(num -> System.out.print(num+" "));
		
		System.out.println();
		
		return;
	}

}
