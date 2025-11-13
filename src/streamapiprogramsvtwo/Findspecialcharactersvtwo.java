package streamapiprogramsvtwo;

import java.util.stream.Collectors;

public class Findspecialcharactersvtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findSpecialCharacters("sathya)(*&@!#$%loves)(*&monisha");
		
		findSpecialCharacters("sathya loves srimathi");


	}
	
	public static void findSpecialCharacters (String str) {
		
		String output = str.chars()
				.filter(c->!Character.isLetterOrDigit(c))
				.mapToObj(c->String.valueOf((char)c))
				.collect(Collectors.joining(" "));
		
		System.out.println(output);
		
		return;
	}

}
