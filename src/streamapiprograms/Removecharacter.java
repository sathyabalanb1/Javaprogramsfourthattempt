package streamapiprograms;

import java.util.stream.Collectors;

public class Removecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ans;
		ans=removeGivenCharacter("sathyabalan",'a');
		System.out.println(ans);

	}
	
	public static String removeGivenCharacter (String str,char ch) {
		
		if(str==null || str.isEmpty()) {
			return str;
		}
		
		String output = str.chars()
				.filter(c->c!=ch)
				.mapToObj(c-> String.valueOf((char)c))
				.collect(Collectors.joining());
		
		return output;
		
	}

}
