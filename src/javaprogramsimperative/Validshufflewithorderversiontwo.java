package javaprogramsimperative;

public class Validshufflewithorderversiontwo {

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
		
		while(k<s3.length()) {
			if(i<s1.length() && s1.charAt(i)==s3.charAt(k)) {
				i++;
				k++;
			}else if(j<s2.length() && s2.charAt(j)==s3.charAt(k)) {
				j++;
				k++;
			}else {
				return false;
			}
		}
		
		return i==s1.length() && j==s2.length();
	}

}
