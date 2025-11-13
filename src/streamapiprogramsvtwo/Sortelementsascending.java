package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sortelementsascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>ip = Arrays.asList(9,8,6,4,2,1,3,10,7,5);
		
		sortElementsAscending(ip);

	}
	
	public static void sortElementsAscending (List<Integer>input) {
		
		List<Integer>output = input.stream()
									.sorted()
									.collect(Collectors.toList());
		
		System.out.println(output);
		
		return;
	}

}
