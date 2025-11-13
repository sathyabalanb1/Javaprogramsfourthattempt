package javaprogramsimperative;

public class Averagefloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=averageFloor(5,10);
		System.out.println(ans);

		ans=averageFloor(5,-10);
		System.out.println(ans);
	}
	
	public static int averageFloor (int a,int b) {
		
		double avg = (a+b)/2.0;
		
		return (int) Math.floor(avg);
	}

}
