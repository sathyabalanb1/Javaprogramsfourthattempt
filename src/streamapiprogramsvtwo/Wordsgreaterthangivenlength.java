package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.List;

public class Wordsgreaterthangivenlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>a= Arrays.asList("sathya","bavi","moni","balan","Baktha","cat");
		
		greaterThanGivenLength(a);

	}
	
	public static void greaterThanGivenLength (List<String>input) {
		
		long output = input.stream()
				.filter(word->word.length()>4)
				.count();
		
		System.out.println(output);
		
		return;
	}

}
