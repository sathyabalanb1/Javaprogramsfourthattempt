package javaprogramsimperative;

public class Replacewithstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ans;
		ans=replaceWithString("Java is best programming language","%20");
		System.out.println(ans);
		
		ans=replaceWithString("I like a girl like monisha","%20");
		System.out.println(ans);
		
		ans=replaceWithString("Sathya*loves*Bavithra","%20");
		System.out.println(ans);
		
		ans=replaceWithString("     ","%20");
		System.out.println(ans);



	}
	
	public static String replaceWithString (String str,String repl) {
		
		int i=0;
		
		char c;
		
		StringBuilder sb = new StringBuilder(str);
		
		while(i<sb.length()) {
			c=sb.charAt(i);
			if(c==' ') {
				sb.replace(i, i+1, repl);
			}
			i++;
		}
		
		return sb.toString();
	}

}
