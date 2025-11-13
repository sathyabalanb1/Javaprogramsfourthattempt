package javaprogramsimperative;

public class Factorialrecursion {

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
		
		if(n==0 || n==1) {
			return 1;
		}
		
		return n*factorial(n-1);
	}

}
