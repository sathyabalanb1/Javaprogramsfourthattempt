package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.List;

public class Calculatesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>a = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		calculateSum(a);

	}
	
	public static void calculateSum (List<Integer>input) {
		
		int output = input.stream()
			 .reduce(0,Integer::sum);
		
		System.out.println(output);
		
		return;
	}

}
