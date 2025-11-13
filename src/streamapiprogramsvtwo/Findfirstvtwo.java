package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Findfirstvtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>a = Arrays.asList("kavin","hari","santhosh","pranav");
		
		List<String>b = Arrays.asList("sathish","Sathyabalan","Samantha","Suganya");
		
		findFirstElement(a);
		findFirstElement(b);

	}
	
	public static void findFirstElement (List<String>input) {
		
		Optional<String>output=input.stream()
			 .filter(word->word.startsWith("S"))
			 .findFirst();
		
		output.ifPresentOrElse(System.out::println, ()->System.out.println("None"));
		
		return;
	}

}
