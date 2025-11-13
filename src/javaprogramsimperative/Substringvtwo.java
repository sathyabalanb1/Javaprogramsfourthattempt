package javaprogramsimperative;

public class Substringvtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans=subString("opqrcbcbcmlkj","bcm");
		System.out.println(ans);
		
		ans=subString("abcdefg","xyz");
		System.out.println(ans);
		
		ans=subString("sathyabalan","bala");
		System.out.println(ans);
		
		ans=subString("lkjhbchbdf","hbk");
		System.out.println(ans);
		
		ans=subString("mncaklpqrst","akj");
		System.out.println(ans);

	}
	
	public static boolean subString (String str,String sub) {
		
		int i=0,j=0,count=0;
		
		char c,d;
		
		while(i<sub.length()) {
			while(j<str.length()) {
				c=sub.charAt(i);
				d=str.charAt(j);
				if(c==d) {
					j++;
					count++;
					break;
				}else if(i==0) {
					j++;
				}else if(i!=0) {
					i=0;
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
