package javaprogramsimperative;

public class Reversesentencelibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ans;
		ans=reverseSentence("Java is best programming language");
		System.out.println(ans);
		
		ans=reverseSentence("a b c d e f g h");
		System.out.println(ans);
		
		ans=reverseSentence("sathya sighting monisha monitoring sathya");
		System.out.println(ans);


	}
	
	public static String reverseSentence (String str) {
		
		String temp[];
		
		temp=str.split(" ");
		
		int i=temp.length-1;
		
		StringBuilder sb = new StringBuilder();
		
		String word;
		
		while(i>=0) {
			word=temp[i];
			sb.append(word+" ");
			i--;
		}
		
		return sb.toString();
	}

}
