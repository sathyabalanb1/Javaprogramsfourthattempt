package javaprogramsimperative;

public class Roundoff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=roundOff(11.9);
		System.out.println(ans);
		
		ans=roundOff(13.0);
		System.out.println(ans);
		
		ans=roundOff(26.1);
		System.out.println(ans);

	}
	
	public static int roundOff (double d) {
		
		return (int) (d+0.5);
	}

}
