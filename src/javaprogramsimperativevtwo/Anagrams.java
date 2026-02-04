package javaprogramsimperativevtwo;

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
		
		int i=0,j=0;
		
		char c;
		
		int count[]=new int[26];
		int sum[]=new int[26];
		
		s1=removePunctuations(s1);
		s2=removePunctuations(s2);
		
		s1=convertToLowercase(s1);
		s2=convertToLowercase(s2);
		
		while(i<s1.length()) {
			c=s1.charAt(i);
			count[c-97]++;
			i++;
		}
		while(j<s2.length()) {
			c=s2.charAt(j);
			sum[c-97]++;
			j++;
		}
		
		return isElementWiseEqual(count,sum);
		
		
	}
	
	public static String removePunctuations(String str) {
		
		int i=0;
		
		char c;
		
		StringBuilder sb = new StringBuilder();
		
		while(i<str.length()) {
			c=str.charAt(i);
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
	
	public static boolean isLower (char c) {
		
		if(c>='a' && c<='z') {
			return true;
		}else {
			return false;
		}
	}
	
	public static char toLower (char c) {
		
		return (char) (c+32);
	}
	
	public static String convertToLowercase(String str) {
		
		int i=0;
		
		char c;
		
		StringBuilder sb = new StringBuilder();
		
		while(i<str.length()) {
			c=str.charAt(i);
			if(isLower(c)) {
				sb.append(c);
			}else {
				sb.append(toLower(c));
			}
			i++;
		}
		
		return sb.toString();
	}
	
	public static boolean isElementWiseEqual (int arr1[],int arr2[]) {
		
		int i=0;
		
		if(arr1.length != arr2.length) {
			return false;
		}
		
		while(i<arr1.length) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
			i++;
		}
		
		return true;
	}

}
