package booleanproblems;

public class Trianglepossible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans=isTrianglePossible(3,4,5);
		System.out.println(ans);
		
		ans=isTrianglePossible(1,2,3);
		System.out.println(ans);

	}
	
	public static boolean isTrianglePossible (int a, int b, int c) {
		
		if(a+b>c && b+c>a && c+a>b) {
			return true;
		}else {
			return false;
		}
	}

}
