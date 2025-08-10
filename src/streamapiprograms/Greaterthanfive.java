package streamapiprograms;

import java.util.Arrays;
import java.util.List;

public class Greaterthanfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>a = Arrays.asList(4,8,12,3,2,17,5);
		
		greaterThanFive(a);

	}
	
	public static void greaterThanFive (List<Integer>input) {
		
		long output = input.stream()
				.filter(num -> num>5)
				.count();
		
		System.out.println(output);
		return;
	}

}
