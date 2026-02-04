package javaprogramsimperativevtwo;

public class Validshufflewithorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans=validShuffleWithOrder("abc","def","dabecf");
		System.out.println(ans);
		
		ans = validShuffleWithOrder("abc","def","acbedf");
		System.out.println(ans);
		
		ans = validShuffleWithOrder("abC","def","dabefc");
		System.out.println(ans);
		
		ans = validShuffleWithOrder("ab","def","dabefc");
		System.out.println(ans);
		
		ans = validShuffleWithOrder("abc","def","abcdef");
		System.out.println(ans); 

	}
	
	public static boolean validShuffleWithOrder (String s1,String s2,String s3) {
		
		int i=0,j=0,k=0;
		
		char c;
		
		if(s1.length()+s2.length() != s3.length()) {
			return false;
		}
		
		while(k<s3.length()) {
			c=s3.charAt(k);
			if(i<s1.length() && c==s1.charAt(i)) {
				i++;
			}else if(j<s2.length() && c==s2.charAt(j)) {
				j++;
			}else {
				return false;
			}
			k++;
		}
		
		return i==s1.length() && j==s2.length();
	}

}
