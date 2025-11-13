package javaprogramsimperative;

public class Strongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans=isStrongNumber(145);
		System.out.println(ans);
		
		ans=isStrongNumber(40585);
		System.out.println(ans);
		
		ans=isStrongNumber(2);
		System.out.println(ans);
		
		ans=isStrongNumber(69);
		System.out.println(ans);
		
		ans=isStrongNumber(146);
		System.out.println(ans);
		
		ans=isStrongNumber(40584);
		System.out.println(ans);

	}
	
	public static boolean isStrongNumber (int n) {
		
		int num=n,sum=0,temp,i,rem;
		
		while(num!=0) {
			rem=num%10;
			temp=1;
			i=1;
			while(i<=rem) {
				temp=temp*i;
				i++;
			}
			sum=sum+temp;
			num=num/10;
		}
		
		if(n==sum) {
			return true;
		}else {
			return false;
		}
	}

}
