package javaprogramsimperative;

public class Celciustofarhenteit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ans;
		ans=celciusToFarhenteit(32);
		System.out.println(ans);
		
		ans=celciusToFarhenteit(50);
		System.out.println(ans);

	}
	
	public static double celciusToFarhenteit (int c) {
		
		double f;
		
		f=9.0/5*c+32;
		
		return f;
	}

}
