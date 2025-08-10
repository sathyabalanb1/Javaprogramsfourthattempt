package javaprogramsimperative;

import java.util.ArrayList;
import java.util.List;

public class Splitwords {

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
	
	public static List<String> splitWords (String s1){
		
		int i=0,j=0,k=0,l=0,count=0,wordcount=0,start=0,end=0;
		
		char c,d,e,ch;
		
		String temp;
		
		List<String>output = new ArrayList<>();
		
		while(i<s1.length()-1) {
			
			j=i;
			while(j<s1.length()) {
				c=s1.charAt(j);
				if(isAlphabet(c)) {
					start=j;
					count++;
					break;
				}
				j++;
			}
			
			if(count==0) {
				return output;
			}
			
			k=start;
			
			while(k<s1.length()-1) {
				l=k+1;
				d=s1.charAt(k);
				e=s1.charAt(l);
				
				if(isAlphabet(d) && !isAlphabet(e)) {
					end=k;
					wordcount++;
					temp=copyCharacters(start,end,s1);
					output.add(temp);
					break;
				}
				k++;
			}
			
			if(k==s1.length()-1) {
				ch=s1.charAt(k);
				if(isAlphabet(ch)) {
					end=k;
					wordcount++;
					temp=copyCharacters(start,end,s1);
					output.add(temp);
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
