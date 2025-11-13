package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Evennumberslist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>ip = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		evenNumbersList(ip);

	}
	
	public static void evenNumbersList (List<Integer>input) {
		
		List<Integer>output = input.stream()
				.filter(num->num%2==0)
				.collect(Collectors.toList());
		
		System.out.println(output);
		
		return;
	}

}
