package javaprogramsimperative;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=calculatePower(5,0);
		System.out.println(ans);
		
		ans=calculatePower(2,5);
		System.out.println(ans);
		
		ans=calculatePower(0,0);
		System.out.println(ans);
		
		ans=calculatePower(4,3);
		System.out.println(ans);

	}
	
	public static int calculatePower (int n,int power) {
		
		int output=1,i=1;
		
		while(i<=power) {
			output=output*n;
			i++;
		}
		
		return output;
	}

}
