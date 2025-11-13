package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sortelementsdescendingvtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>a=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		sortElementsDescending(a);

	}
	
	public static void sortElementsDescending (List<Integer>input) {
		
		List<Integer>output = input.stream()
			.sorted(Comparator.reverseOrder())
			.collect(Collectors.toList());
		
		output.forEach(num->System.out.print(num+" "));
		
		System.out.println();
		
		return;
	}

}
