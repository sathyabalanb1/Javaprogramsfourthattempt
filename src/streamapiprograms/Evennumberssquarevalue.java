package streamapiprograms;

import java.util.Arrays;
import java.util.List;

public class Evennumberssquarevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>a = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		evenNumbersSquareValue(a);

	}
	
	public static void evenNumbersSquareValue (List<Integer>input) {
		
		int output = input.stream()
						.filter(num -> num%2==0)
						.mapToInt(num -> num*num)
						.sum();
		
		System.out.println(output);
		return;
	}

}
