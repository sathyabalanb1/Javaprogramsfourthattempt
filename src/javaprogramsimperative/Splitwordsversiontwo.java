package javaprogramsimperative;

import java.util.ArrayList;
import java.util.List;

public class Splitwordsversiontwo {

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
		
		int i=0,j=0,k=0,l=0,start=0,end=0,wordCount=0,count=0;
		
		char c,d,e,ch;
		
		String temp;
		
		List<String>words = new ArrayList<>();
		
		while(i<str.length()-1) {
			j=i;
			while(j<str.length()) {
				c=str.charAt(j);
				if(isAlphabet(c)) {
					start=j;
					count++;
					break;
				}
				j++;
			}
			
			if(count==0) {
				return words;
			}
			
			k=start;
			
			while(k<str.length()-1) {
				l=k+1;
				d=str.charAt(k);
				e=str.charAt(l);
				if(isAlphabet(d) && !isAlphabet(e)) {
					end=k;
					wordCount++;
					temp=copyCharacters(start,end,str);
					words.add(temp);
					break;
				}
				k++;
			}
			
			if(k==str.length()-1) {
				ch=str.charAt(k);
				if(isAlphabet(ch)) {
					end=k;
					wordCount++;
					temp=copyCharacters(start,end,str);
					words.add(temp);
					break;
				}else {
					break;
				}
			}
			i=l;
			count=0;
		}
		
		return words;
		
		
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
	
	public static String copyCharacters (int start,int end,String s1) {
		
		int i=start;
		
		char c;
		
		StringBuilder sb = new StringBuilder();
		
		while(i<=end) {
			c=s1.charAt(i);
			sb.append(c);
			i++;
		}
		
		return sb.toString();
	}

}
