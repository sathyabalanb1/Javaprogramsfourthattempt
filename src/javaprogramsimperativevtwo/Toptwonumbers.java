package javaprogramsimperativevtwo;

public class Toptwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {20,20};
		
		int b[] = null;
		
		int c[] = {50,32,26,60,50,19,51,26,26,77,13};
		
		int d[] = {23,38,23};
		
		findTopTwoNumbers(a);
		findTopTwoNumbers(b);
		findTopTwoNumbers(c);
		findTopTwoNumbers(d);

	}
	
	public static void findTopTwoNumbers (int x[]) {
		
		if(x==null || x.length<2) {
			System.out.println("Minimum two numbers required");
			return;
		}
		
		int i=0,firstMax=Integer.MIN_VALUE, secondMax=Integer.MIN_VALUE;
		
		while(i<x.length) {
			if(x[i]>firstMax) {
				firstMax=x[i];
			}else if(x[i]>secondMax && x[i]<firstMax) {
				secondMax=x[i];
			}
			i++;
		}
		
		if(secondMax==Integer.MIN_VALUE) {
			System.out.println("FirstMax: "+firstMax+", "+"SecondMax: "+ "Not Available");
			return;
		}else {
			System.out.println("FirstMax: "+firstMax+", "+"SecondMax: "+ secondMax);
			return;
		}
	}

}
