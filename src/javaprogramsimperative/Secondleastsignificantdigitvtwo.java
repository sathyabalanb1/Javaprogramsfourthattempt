package javaprogramsimperative;

public class Secondleastsignificantdigitvtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=secondLeastDigit(929);
		System.out.println(ans);
		
		ans=secondLeastDigit(5478);
		System.out.println(ans);
		
		ans=secondLeastDigit(39);
		System.out.println(ans);
		
		ans=secondLeastDigit(1);
		System.out.println(ans);


	}
	
	public static int secondLeastDigit (int n) {
		
		int slsd;
		
		slsd= (n/10)%10;
		
		return slsd;
	}

}
