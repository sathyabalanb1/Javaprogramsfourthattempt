package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.List;

public class Greaterthanfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>ip = Arrays.asList(5,5,1,8,10,20,1,13,2,3,4,5);
		
		greaterThanFive(ip);

	}
	
	public static void greaterThanFive (List<Integer>input) {
		
		long output = input.stream().filter(num->num>5)
						.count();
		
		System.out.println(output);
		
		return;
	}

}
