package streamapiprograms;

import java.util.Arrays;
import java.util.List;

public class Wordsgreaterthangivenlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>a=Arrays.asList("kav","hari","selva","pavan","velu","git");
		
		wordsGreaterThanGivenLength(a);

	}
	
	public static void wordsGreaterThanGivenLength (List<String>input) {
		
		long output = input.stream()
							.filter(word -> word.length()>3)
							.count();
		
		System.out.println(output);
		return;
	}

}
