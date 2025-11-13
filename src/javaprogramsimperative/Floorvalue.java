package javaprogramsimperative;

public class Floorvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// greater integer less than or equal to actual average
		
		int ans;
		ans=floorValue(5,10);
		System.out.println(ans);
		
		ans=floorValue(5,-10);
		System.out.println(ans);
	}
	
	public static int floorValue (int a, int b) {
		
		double avg = (a+b)/2.0;
		
		return (int) Math.floor(avg);
	}

}
