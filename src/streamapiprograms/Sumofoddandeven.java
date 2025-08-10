package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sumofoddandeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>a = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		sumOfOddAndEven(a);

	}
	
	public static void sumOfOddAndEven (List<Integer>input) {
		
		Map<Boolean,Integer>output = input.stream()
									.collect(Collectors.partitioningBy(num->num%2==0,
									Collectors.summingInt(Integer::intValue)));
		
		int evenNumbersSum = output.get(true);
		int oddNumbersSum = output.get(false);
		
		System.out.println("Odd Numbers sum: "+oddNumbersSum);
		System.out.println("Even Numbers sum: "+evenNumbersSum);
		
		return;
	}

}
