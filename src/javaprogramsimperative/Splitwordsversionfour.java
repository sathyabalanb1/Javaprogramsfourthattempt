package javaprogramsimperative;

import java.util.ArrayList;
import java.util.List;

public class Splitwordsversionfour {

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
		
		char c,d,e,ch;
		
		List<String>output = new ArrayList<>();
		
		String word;
		
		while(i<str.length()-1) {
			j=i;
			while(j<str.length()-1) {
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
					word=copyCharacters(str,start,end);
					output.add(word);
					break;
				}
				k++;
			}
			if(k==str.length()-1) {
				ch=str.charAt(k);
				if(isAlphabet(ch)) {
					wordCount++;
					end=k;
					word=copyCharacters(str,start,end);
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
	
	public static boolean isAlphabet (char c) {
		
		if(c>='a' && c<='z') {
			return true;
		}else if(c>='A' && c<='Z') {
			return true;
		}else {
			return false;
		}
	}
	
	public static String copyCharacters (String str,int start,int end) {
		
		int i=start;
		
		StringBuilder sb = new StringBuilder();
		
		char c;
		
		while(i<=end) {
			c=str.charAt(i);
			sb.append(c);
			i++;
		}
		
		return sb.toString();
		
	}

}
