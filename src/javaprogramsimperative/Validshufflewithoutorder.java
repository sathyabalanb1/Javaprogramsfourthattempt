package javaprogramsimperative;

public class Validshufflewithoutorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans=isValidShuffle("abc","def","afdcbe");
		System.out.println(ans);
		
		ans=isValidShuffle("abc","deF","afdcbe");
		System.out.println(ans);
		
		ans=isValidShuffle("LKJ","opq","LoKpJq");
		System.out.println(ans);
		
		ans=isValidShuffle("abcd","uikl","LoK");
		System.out.println(ans);

	}
	
	public static boolean isValidShuffle (String s1, String s2, String s3) {
		
		int i=0,j=0,k=0,count=0,sum=0;
		
		char c,d,e;
		
		if(s1.length()+s2.length() != s3.length()) {
			return false;
		}
		
		while(i<s1.length()) {
			c=s1.charAt(i);
			count=count+(int)c;
			i++;
		}
		
		while(j<s2.length()) {
			d=s2.charAt(j);
			count=count+(int)d;
			j++;
		}
		
		while(k<s3.length()) {
			e=s3.charAt(k);
			sum=sum+(int)e;
			k++;
		}
		
		return count==sum;
		
		
	}

}
