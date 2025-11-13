package javaprogramsimperative;

public class Exactlyoneduplicatenumbervtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {0,1,2,3,2};
		
		int b[] = {0,1,2,3,4,5,6,7,8,7};
		
		int ans;
		ans=exactOneDuplicateNumber(a);
		System.out.println(ans);
		
		ans=exactOneDuplicateNumber(b);
		System.out.println(ans);


	}
	
	public static int exactOneDuplicateNumber (int x[]) {
		
		int uniqueNumbersSum=0,actualSum=0,n=x.length;
		
		uniqueNumbersSum = (n-2)*(n-1)/2;
		
		for(int num:x) {
			actualSum=actualSum+num;
		}
		
		return actualSum-uniqueNumbersSum;
		
		
	}

}
