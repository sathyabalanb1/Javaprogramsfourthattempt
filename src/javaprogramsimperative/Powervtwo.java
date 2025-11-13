package javaprogramsimperative;

public class Powervtwo {

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
	
	public static int calculatePower (int base,int exponent) {
		
		int output=1,i=1;
		
		while(i<=exponent) {
			output=output*base;
			i++;
		}
		
		return output;
	}

}
