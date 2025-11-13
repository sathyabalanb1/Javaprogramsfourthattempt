package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Touppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>a=Arrays.asList("sathya","Dhivya Devi","MONICA","GRACY");
		
		toUpperCase(a);

	}
	
	public static void toUpperCase(List<String>input) {
		
		List<String>output = input.stream()
			  .map(word->word.toUpperCase())
			  .collect(Collectors.toList());
		
		System.out.println(output);
		
		return;
	}

}
