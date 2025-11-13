package javaprogramsimperative;

public class Absolutevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=absoluteValue(-9);
		System.out.println(ans);
		
		ans=absoluteValue(12);
		System.out.println(ans);
		
		ans=absoluteValue(0);
		System.out.println(ans);

	}
	
	public static int absoluteValue (int n) {
		
		if(n<0) {
			return n*-1;
		}else {
			return n;
		}
	}

}
