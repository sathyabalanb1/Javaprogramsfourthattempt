package javaprogramsimperativevtwo;

public class Minimumdifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {7,13,21,16,5,43};
		
		int b[] = {9,13,7,11,22,6,1,0};
		
		int c[] = {};
		
		int d[] = {99};
		
		int e[] = {12,3,8,25,7,2,46};
		
		minimumDifference(a);
		
		minimumDifference(b);
		
		minimumDifference(c);
		
		minimumDifference(d);
		
		minimumDifference(e);


	}
	
	public static void minimumDifference (int x[]) {
		
		if(x==null || x.length<2) {
			System.out.println("Minimum two numbers required to find the difference");
			return;
		}
		
		int i=0,j=0,sub=0,min=Math.abs(x[0]-x[1]),num1=x[0],num2=x[1];
		
		while(i<x.length-1) {
			j=i+1;
			while(j<x.length) {
				sub=Math.abs(x[i]-x[j]);
				if(min>sub) {
					min=sub;
					num1=x[i];
					num2=x[j];
				}
				j++;
			}
			i++;
		}
		
		System.out.println("Minimum difference between "+num1+" and "+num2+" is: "+min);
		return;
	}

}
