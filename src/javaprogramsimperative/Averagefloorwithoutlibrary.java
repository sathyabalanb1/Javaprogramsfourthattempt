package javaprogramsimperative;

public class Averagefloorwithoutlibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// greater integer less than or equal to actual average
		
				int ans;
				ans=averageFloor(5,10);
				System.out.println(ans);
				
				ans=averageFloor(5,-10);
				System.out.println(ans);

	}
	
	public static int averageFloor (int a,int b) {
		
		int sum=a+b;
		
		int result=(a+b)/2;
		
		if(sum<0 && sum%2 !=0) {
			result--;
		}
		
		return result;
	}

}
