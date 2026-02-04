package javaprogramsimperativevtwo;

public class Swaptwonumberswithoutthird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		swapTwoNumbers(5,10);
	}
	
	public static void swapTwoNumbers (int a, int b) {
		
		System.out.println("Value of a before swapping: "+a);
		System.out.println("Value of b before swapping: "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Value of a after swapping: "+a);
		System.out.println("Value of b after swapping: "+b);
		
		return;
		
	}

}
