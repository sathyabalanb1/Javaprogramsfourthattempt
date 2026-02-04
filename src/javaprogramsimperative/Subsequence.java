package javaprogramsimperative;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans=subSequence("sathyabalan","aybla");
		System.out.println(ans);
		
		ans=subSequence("opqrcbcbcmlkj","bcb");
		System.out.println(ans);
		
		ans=subSequence("abcdefg","xyz");
		System.out.println(ans);
		
		ans=subSequence("lkjhbchbdf","hbk");
		System.out.println(ans);

	}
	
	public static boolean subSequence (String str,String seq) {
		
		int i=0,j=0,count=0;
		
		char c,d;
		
		while(i<seq.length()) {
			c=seq.charAt(i);
			while(j<str.length()) {
				d=str.charAt(j);
				if(c==d) {
					j++;
					count++;
					break;
				}else {
					j++;
				}
			}
			if(count==0) {
				return false;
			}
			i++;
			count=0;
		}
		
		return true;
	}

}
