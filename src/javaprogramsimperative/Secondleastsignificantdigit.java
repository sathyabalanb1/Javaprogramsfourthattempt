package javaprogramsimperative;

public class Secondleastsignificantdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=secondLeastDigit(569);
		System.out.println(ans);
		
		ans=secondLeastDigit(1257);
		System.out.println(ans);
		
		ans=secondLeastDigit(2);
		System.out.println(ans);
		
		ans=secondLeastDigit(39);
		System.out.println(ans);

	}
	
	public static int secondLeastDigit (int num) {
		
		return (num%100)/10;
	}

}
