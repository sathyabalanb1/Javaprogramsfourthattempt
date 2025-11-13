package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Checkanystring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>ip = Arrays.asList("sathya","gowtham","Abinaya","angel","Vasuki");
		
		List<String>ip2 = Arrays.asList("sathya","gowtham","abinaya","angel","Vasuki");

		
		checkAnyString(ip);
		
		checkAnyString(ip2);

	}
	
	public static void checkAnyString (List<String>input) {
		
		Optional<String>output=input.stream().filter(word->word.startsWith("A"))
								.findAny();
		
		output.ifPresentOrElse(System.out::println, ()->System.out.println("None"));
		
		return;
	}

}
