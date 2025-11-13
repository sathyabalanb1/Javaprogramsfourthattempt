package javaprogramsimperative;

public class Threeintegersaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ans;
		ans=findAverage(10,20,30);
		System.out.println(ans);
		
		ans=findAverage(15,15,15);
		System.out.println(ans);
		
		ans=findAverage(23,45,37);
		System.out.println(ans);


	}
	
	public static double findAverage (int a, int b, int c) {
		
		double avg = (a+b+c)/3.0;
		
		return avg;
	}

}
