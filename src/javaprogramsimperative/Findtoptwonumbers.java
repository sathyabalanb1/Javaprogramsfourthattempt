package javaprogramsimperative;

public class Findtoptwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {20,20};
		
		int b[] = null;
		
		int c[] = {50,32,26,60,50,19,51,26,26,77,13};
		
		int d[] = {23,38,23};
		
		int e[] = {};
		
		findTopTwoNumbers(a);
		findTopTwoNumbers(b);
		findTopTwoNumbers(c);
		findTopTwoNumbers(d);
		findTopTwoNumbers(e);


	}
	
	public static void findTopTwoNumbers (int x[]) {
		
		if(x==null || x.length<2) {
			System.out.println("Minimum two numbers required");
			return;
		}
		
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int num: x) {
			if(num>firstMax) {
				firstMax=num;
			}else if(num>secondMax && num<firstMax) {
				secondMax=num;
			}
		}
		
		if(secondMax==Integer.MIN_VALUE) {
			System.out.println("FirstMax: "+firstMax+","+"SecondMax: "+"Not Available");
		}else {
			System.out.println("FirstMax: "+firstMax+",SecondMax: "+secondMax);
		}
		
		return;
	}

}
