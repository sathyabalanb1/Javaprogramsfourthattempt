package javaprogramsimperative;

public class Temperaturetable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		temperatureTable(50);

	}
	
	public static void temperatureTable (int n) {
		
		int i=0,roundFarhenteit;
		
		double f;
		
		while(i<=n) {
			f=celToFarhenteit(i);
			System.out.println(i+":"+(int)(f+0.5));
			i=i+5;
		}
		
		return;
		
	}
	
	public static double celToFarhenteit (int c) {
		
		double f;
		
		f=9.0/5*c+32;
		
		return f;
	}

}
