package javaprogramsimperative;

public class Leastsignificantdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=leastSignificantDigit(55);
		System.out.println(ans);
		
		ans=leastSignificantDigit(129);
		System.out.println(ans);
		
		ans=leastSignificantDigit(6);
		System.out.println(ans);
		
		ans=leastSignificantDigit(10);
		System.out.println(ans);

	}
	
	public static int leastSignificantDigit (int num) {
		
		return num%10;
	}

}
