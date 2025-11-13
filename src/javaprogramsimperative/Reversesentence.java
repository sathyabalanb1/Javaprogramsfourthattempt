package javaprogramsimperative;

import java.util.List;

public class Reversesentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ans;
		ans=reverseSentence("Java is best programming language");
		System.out.println(ans);
		
		ans=reverseSentence("a b c d e f g h");
		System.out.println(ans);
		
		ans=reverseSentence("sathya%$&#sighting123456 monisha*7^ monitoring)(*7^%sathya");
		System.out.println(ans);


	}
	
	public static String reverseSentence (String str) {
		
		List<String>output;
		
		output = Splitwords.splitWords(str);
		
		int i=output.size()-1;
		
		String word;
		
		StringBuilder sb = new StringBuilder();
		
		while(i>=0) {
			word=output.get(i);
			sb.append(word+" ");
			i--;
		}
		
		return sb.toString();
	}

}
