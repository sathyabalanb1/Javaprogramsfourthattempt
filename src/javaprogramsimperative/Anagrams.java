package javaprogramsimperative;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "listen";
		String s2 = "silent";
		
		String s3 = "Listen";
		String s4 = "silenT";
		
		String s5 = "a gentleman";
		String s6 = "elegant man";
		
		String s7 = "";
		String s8 = "sathya";
		
		String s9 = "dormitory!";
		String s10 = "dirty room";
		
		boolean ans;
		ans = isAnagrams(s1,s2);
		System.out.println(ans);
		
		ans = isAnagrams(s3,s4);
		System.out.println(ans);
		
		ans = isAnagrams(s5,s6);
		System.out.println(ans);
		
		ans = isAnagrams(s7,s8);
		System.out.println(ans);
		
		ans = isAnagrams(s9,s10);
		System.out.println(ans);


	}
	
	public static boolean isAnagrams (String s1, String s2) {
		
		s1 = removePunctuations(s1);
		s2 = removePunctuations(s2);
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		int count[] = new int[26];
		int sum[] = new int[26];
		
		int i=0,j=0;
		
		char c,d;
		
		while(i<s1.length()) {
			c=s1.charAt(i);
			count[c-97]++;
			i++;
		}
		
		while(j<s2.length()) {
			d=s2.charAt(j);
			sum[d-97]++;
			j++;
		}
		
		return elementWiseEqual(count,sum);		
		
	}
	
	public static String removePunctuations (String st) {
		
		int i=0;
		char c;
		
		StringBuilder sb = new StringBuilder();
		
		while(i<st.length()) {
			c=st.charAt(i);
			if(isAlphabet(c)) {
				sb.append(c);
			}
			i++;
		}
		
		return sb.toString();
	}
	
	public static boolean isAlphabet (char c) {
		
		if(c>='a' && c<='z') {
			return true;
		}else if(c>='A' && c<='Z') {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean elementWiseEqual (int a1[],int a2[]) {
		
		int i=0;
		
		if(a1.length != a2.length) {
			return false;
		}
		
		while(i<a1.length) {
			if(a1[i]!=a2[i]) {
				return false;
			}
			i++;
		}
		
		return true;
	}

}
