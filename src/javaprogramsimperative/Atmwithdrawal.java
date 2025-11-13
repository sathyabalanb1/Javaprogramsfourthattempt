package javaprogramsimperative;

public class Atmwithdrawal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		atmWithdrawal(3600);
		System.out.println("----");
		atmWithdrawal(700);
		System.out.println("----");
		atmWithdrawal(400);
		
	}
	
	public static void atmWithdrawal (int n) {
		
		int n2000,n500,n100;
		
		n2000=n/2000;
		n500=(n%2000)/500;
		n100=(n%500)/100;
		
		System.out.println("Number of 2000: "+n2000);
		System.out.println("Number of 500: "+n500);
		System.out.println("Number of 100: "+n100);
		
		return;
	}

}
