package streamapiprograms;

import java.util.stream.Collectors;

public class Findspecialcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findSpecialCharacters("Sathya#%loves)*&monisha&");

	}
	
	public static void findSpecialCharacters (String str) {
		
		System.out.println("Input String: "+str);
		
		String output = str.chars()
				.filter(c-> !Character.isLetterOrDigit(c))
				.mapToObj(c->String.valueOf((char)c))
				.collect(Collectors.joining(" "));
		
		System.out.println("Special Character: "+output);
		return;
				
	}

}
