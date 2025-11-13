package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Skipelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>ip = Arrays.asList(21,22,23,24,25,26,27,28,29,30);
		
		skipElements(ip);

	}
	
	public static void skipElements (List<Integer>input) {
		
		List<Integer>output = input.stream().skip(3).
				collect(Collectors.toList());
		
		System.out.println(output);
		
		return;
	}

}
