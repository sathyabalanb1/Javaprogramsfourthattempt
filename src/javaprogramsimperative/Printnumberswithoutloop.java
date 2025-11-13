package javaprogramsimperative;

public class Printnumberswithoutloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printNumbers(15);
		System.out.println();
		
		printNumbers(7);
		System.out.println();

	}
	
	public static void printNumbers (int n) {
		
		if(n==0) {
			return;
		}
		
		printNumbers(n-1);
		
		System.out.print(n+" ");
		
	}

}
