package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Converttoset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>ip = Arrays.asList(1,1,2,3,4,4,4,5,5,6,6,6,6,7,8,9,9,9,10);
		
		convertToSet(ip);

	}
	
	public static void convertToSet (List<Integer>input) {
		
		Set<Integer>output= input.stream().collect(Collectors.toSet());
		
		System.out.println(output);
		
		return;
	}

}
