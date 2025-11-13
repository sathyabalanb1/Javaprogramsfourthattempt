package javaprogramsimperative;

public class Factorialvtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=factorial(5);
		System.out.println(ans);
		
		ans=factorial(0);
		System.out.println(ans);
		
		ans=factorial(1);
		System.out.println(ans);

	}
	
	public static int factorial (int n) {
		
		int i=1,fact=1;
		
		while(i<=n) {
			fact=fact*i;
			i++;
		}
		
		return fact;
	}

}
