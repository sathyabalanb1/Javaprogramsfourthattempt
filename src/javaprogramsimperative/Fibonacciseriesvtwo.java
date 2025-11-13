package javaprogramsimperative;

public class Fibonacciseriesvtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fibonacciSeries(0);
		
		fibonacciSeries(10);
		
		fibonacciSeries(1);
		
		fibonacciSeries(20);
		
		fibonacciSeries(2);

	}
	
	public static void fibonacciSeries (int n) {
		
		int i=0,j=1,temp=0;
		
		System.out.print(temp+", ");
		
		while(i<=n) {
			temp=i+j;
			if(temp<=n) {
				System.out.print(temp+", ");
			}
			j=i;
			i=temp;
		}
		
		System.out.println();
		return;
	}

}
