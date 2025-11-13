package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.List;

public class Checkanystringvtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>ip = Arrays.asList("sathya","gowtham","Abinaya","angel","Vasuki");
		
		List<String>ip2 = Arrays.asList("sathya","gowtham","abinaya","angel","Vasuki");

		
		checkAnyString(ip);
		
		checkAnyString(ip2);

	}
	
	public static void checkAnyString (List<String>input) {
		
		boolean output = input.stream().anyMatch(word->word.startsWith("A"));
		
		System.out.println(output);
		
		return;
	}

}
