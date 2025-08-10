package javaprogramsimperative;

public class Reversestringrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ans;
		ans=reverseString("Hello");
		System.out.println(ans);
		
		ans=reverseString("Sathyabalan");
		System.out.println(ans);
		
		ans=reverseString("ST");
		System.out.println(ans);
		
		ans=reverseString("12345");
		System.out.println(ans);
		
		ans=reverseString("B");
		System.out.println(ans);


	}
	
	public static String reverseString (String str) {
		
		if(str==null || str.isEmpty() || str.length()==1) {
			return str;
		}
		
		char c;
		int i=0,j=str.length()-1;
		String rem;
		
		c=str.charAt(str.length()-1);
		
		rem=str.substring(i, j);
		
		return c+reverseString(rem);
		
	}

}
