package javaprogramsimperative;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=reverseNumber(1405);
		System.out.println(ans);
		
		ans=reverseNumber(1234567890);
		System.out.println(ans);
		
		ans=reverseNumber(20);
		System.out.println(ans);



	}
	
	public static int reverseNumber (int n) {
		
		int num=n,sum=0,rem;
		
		while(num!=0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		
		return sum;
	}

}
