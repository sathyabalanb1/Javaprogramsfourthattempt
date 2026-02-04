package javaprogramsimperative;

import java.util.Arrays;

public class Splitwordslibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ans[];
		ans=splitWords("Java is best programming language");
		System.out.println(Arrays.toString(ans));

	}
	
	public static String[] splitWords (String str) {
		
		String output[];
		
		output = str.split(" ");
		
		return output;
		
	}

}
