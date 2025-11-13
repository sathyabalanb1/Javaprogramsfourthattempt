package javaprogramsimperative;

import java.util.ArrayList;
import java.util.List;

public class Splitwordsvthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>ans;
		ans=splitWords("Java  is#$@^&best programming)(*&^language");
		System.out.println(ans);
		
		ans=splitWords("   1234 #$%^&*()!   &^%$12098");
		System.out.println(ans);
		
		ans=splitWords("a b c d e f g h i");
		System.out.println(ans);
		
		ans=splitWords("      he is       a");
		System.out.println(ans);
		
		ans=splitWords("I want to enjoy nethra y ");
		System.out.println(ans);


	}
	
	public static List<String> splitWords (String str){
		
		int i=0,j=0,k=0,l=0,start=0,end=0,count=0,wordCount=0;
		
		char c,d,e;
		
		String word;
		
		List<String>output = new ArrayList<>();
		
		while(i<str.length()-1) {
			j=i;
			while(j<str.length()) {
				c=str.charAt(j);
				if(isAlphabet(c)) {
					count++;
					break;
				}
				j++;
			}
			if(count==0) {
				return output;
			}
			start=j;
			k=start;
			
			while(k<str.length()-1) {
				l=k+1;
				d=str.charAt(k);
				e=str.charAt(l);
				
				if(isAlphabet(d) && !isAlphabet(e)) {
					wordCount++;
					end=k;
					word=copyCharacters(start,end,str);
					output.add(word);
					break;
				}
				k++;
			}
			
			if(k==str.length()-1) {
				c=str.charAt(k);
				if(isAlphabet(c)) {
					wordCount++;
					end=k;
					word=copyCharacters(start,end,str);
					output.add(word);
					break;
				}else {
					break;
				}
			}
			i=l;
			count=0;
		}
		
		return output;
	}
	
	public static boolean isAlphabet (char ch) {
		
		if(ch>='a' && ch<='z') {
			return true;
		}else if(ch>='A' && ch<='Z') {
			return true;
		}else {
			return false;
		}
	}
	
	public static String copyCharacters (int st, int ed,String input) {
		
		int i=st;
		
		char c;
		
		StringBuilder sb = new StringBuilder();
		
		while(i<=ed) {
			c=input.charAt(i);
			sb.append(c);
			i++;
		}
		
		return sb.toString();
	}


}
