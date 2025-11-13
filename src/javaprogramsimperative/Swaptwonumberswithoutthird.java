package javaprogramsimperative;

public class Swaptwonumberswithoutthird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		swapTwoNumbers(5,10);

	}
	
	public static void swapTwoNumbers(int a,int b) {
		
		System.out.println("Value of a Before Swap: "+a);
		System.out.println("Value of b Before Swap: "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Value of a After Swap: "+a);
		System.out.println("Value of b After Swap: "+b);
		
		return;
		
	}

}
