package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sumoddandevennumbersvtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>a = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		sumOddAndEvenNumbers(a);

	}
	
	public static void sumOddAndEvenNumbers (List<Integer>input) {
		
		Map<Boolean,Integer>output=
				input.stream().collect(Collectors.partitioningBy(num->num%2==0,
				Collectors.summingInt(Integer::intValue)));
		
		int oddNumbersSum = output.get(false);
		int evenNumbersSum = output.get(true);
		
		System.out.println("Odd Numbers Sum: "+oddNumbersSum);
		System.out.println("Even Numbers Sum: "+evenNumbersSum);
		
		return;
	}

}
