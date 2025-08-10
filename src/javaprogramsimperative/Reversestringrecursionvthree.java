package javaprogramsimperative;

public class Reversestringrecursionvthree {

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
		String rem;
		
		int i=0,j=str.length()-1;
		
		c=str.charAt(j);
		rem=str.substring(i, j);
		
		return c+reverseString(rem);
		
	}

}
