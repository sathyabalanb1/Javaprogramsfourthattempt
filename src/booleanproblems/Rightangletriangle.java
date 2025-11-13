package booleanproblems;

public class Rightangletriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans=isRightAngleTriangle(5,3,4);
		System.out.println(ans);
		
		ans=isRightAngleTriangle(2,3,4);
		System.out.println(ans);
		
		ans=isRightAngleTriangle(5,13,12);
		System.out.println(ans);
		
		ans=isRightAngleTriangle(5,6,7);
		System.out.println(ans);

	}
	
	public static boolean isRightAngleTriangle (int a,int b,int c) {
		
		if(a*a+b*b==c*c) {
			return true;
		}else if(b*b+c*c==a*a) {
			return true;
		}else if(c*c+a*a==b*b) {
			return true;
		}else {
			return false;
		}
	}

}
