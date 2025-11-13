package javaprogramsimperative;

public class Stringcomparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=stringComparison("bala","balan");
		System.out.println(ans);
		
		ans=stringComparison("aaabc","z");
		System.out.println(ans);
		
		ans=stringComparison("sathya","sathya");
		System.out.println(ans);
		
		ans=stringComparison("y","sathyabalan");
		System.out.println(ans);

	}
	
	public static int stringComparison (String str1,String str2) {
		
		int i=0,len;
		
		char c,d;
		
		if(str1.length()<str2.length()) {
			len=str1.length();
		}else {
			len=str2.length();
		}
		
		while(i<len) {
			c=str1.charAt(i);
			d=str2.charAt(i);
			if(c==d) {
				i++;
			}else if(c<d) {
				return -1;
			}else if(c>d) {
				return 1;
			}
		}
		
		if(str1.length()==str2.length()) {
			return 0;
		}else if(str1.length()<str2.length()) {
			return -1;
		}else {
			return 1;
		}
	}

}
