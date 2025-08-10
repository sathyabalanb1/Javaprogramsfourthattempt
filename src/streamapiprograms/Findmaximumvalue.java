package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Findmaximumvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>a = Arrays.asList(7,3,8,12,9);
		
		findMaximumValue(a);

	}
	
	public static void findMaximumValue (List<Integer>input) {
		
		Optional<Integer>maxValue = input.stream()
										.max(Integer::compareTo);
		
		if(maxValue.isPresent()) {
			System.out.println(maxValue.get());
		}else {
			System.out.println("None");
		}
	}

}
