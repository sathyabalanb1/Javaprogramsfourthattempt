package javaprogramsimperative;

public class Returnwordsversiontwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String output;
		output=returnWords("Java is best   programming*&^%$ language",5);
		System.out.println(output);
		
		output=returnWords("Sathya (*&6%$#@loves)(*&^5monisha",4);
		System.out.println(output);
		
		output=returnWords("a b c d e f g h",8);
		System.out.println(output);
		
		output=returnWords(" &^%$#@!)(*",2);
		System.out.println(output);
		
		output=returnWords("kd lk gh i)(",9);
		System.out.println(output);


	}

	public static String returnWords (String str,int n) {

		int i=0,j=0,k=0,l=0,start=0,end=0,count=0,wordCount=0;

		char c,d,e;

		String word;

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
				return str;
			}

			start=j;
			k=start;

			while(k<str.length()-1) {
				l=k+1;
				d=str.charAt(k);
				e=str.charAt(l);
				if(isAlphabet(d) && !isAlphabet(e)) {
					end=k;
					wordCount++;
					if(n==wordCount) {
						word=pickWord(start,end,str);
						return word;
					}else {
						break;
					}
				}
				k++;
			}

			if(k==str.length()-1) {
				c=str.charAt(k);
				if(isAlphabet(c)) {
					end=k;
					wordCount++;
					if(n==wordCount) {
						word=pickWord(start,end,str);
						return word;
					}
				}
			}
			i=l;
			count=0;
		}

		return str;
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

	public static String pickWord (int st,int ed,String strg) {

		int i=st;

		StringBuilder sb = new StringBuilder();

		char c;

		while(i<=ed) {
			c=strg.charAt(i);
			sb.append(c);
			i++;
		}

		return sb.toString();
	}


}
