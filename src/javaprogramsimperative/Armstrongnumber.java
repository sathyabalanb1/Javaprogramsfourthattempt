package javaprogramsimperative;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans=isArmstrongNumber(153);
		System.out.println(ans);
		
		ans=isArmstrongNumber(1);
		System.out.println(ans);
		
		ans=isArmstrongNumber(0);
		System.out.println(ans);
		
		ans=isArmstrongNumber(370);
		System.out.println(ans);
		
		ans=isArmstrongNumber(9474);
		System.out.println(ans);
		
		System.out.println("------negative scenarios------");
		
		ans=isArmstrongNumber(123);
		System.out.println(ans);
		
		ans=isArmstrongNumber(996);
		System.out.println(ans);
		
		ans=isArmstrongNumber(7548);
		System.out.println(ans);
		
		ans=isArmstrongNumber(86729);
		System.out.println(ans);
		
		ans=isArmstrongNumber(10);
		System.out.println(ans);


	}
	
	public static boolean isArmstrongNumber (int n) {
		
		int num=n,sum=0,temp=1,count=0,rem,i;
				
		while(num!=0) {
			count++;
			num=num/10;
		}
		
		num=n;
		
		while(num != 0) {
			rem=num%10;
			i=1;
			temp=1;
			while(i<=count) {
				temp=temp*rem;
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
