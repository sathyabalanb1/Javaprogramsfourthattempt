package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinctelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>ip = Arrays.asList(1,1,2,2,2,3,4,5,6,6,6,6,7,8,8,9,10);
		
		distinctElements(ip);

	}
	
	public static void distinctElements (List<Integer>input) {
		
		List<Integer>output = input.stream()
			 .distinct()
			 .collect(Collectors.toList());
		
		System.out.println(output);
		
		return;
	}

}
