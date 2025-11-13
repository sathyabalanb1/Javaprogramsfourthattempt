package booleanproblems;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans=isLeapYear(1808);
		System.out.println(ans);
		
		ans=isLeapYear(1600);
		System.out.println(ans);
		
		ans=isLeapYear(1605);
		System.out.println(ans);
		
		ans=isLeapYear(1700);
		System.out.println(ans);

	}
	
	public static boolean isLeapYear (int n) {
		
		return (n%400==0) || (n%4==0 && n%100!=0);
	}

}
