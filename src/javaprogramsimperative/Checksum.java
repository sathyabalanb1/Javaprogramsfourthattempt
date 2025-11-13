package javaprogramsimperative;

public class Checksum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		validChecksum(32346);
		
		validChecksum(5672);
		
		validChecksum(21);
		
		validChecksum(42);
		
		validChecksum(53);
		
		validChecksum(5);
		
		validChecksum(9);
		
		validChecksum(9999);


	}
	
	public static void validChecksum (int n) {
		
		int num=n,checkSum=0,checkDigit=0,rem,cSum=0,count=0;
		
		if(n>=1 && n<=9) {
			System.out.println("Success");
			return;
		}
		
		checkDigit=num%10;
		
		num=n/10;
		
		while(num!=0) {
			count++;
			num=num/10;
		}
		
		num=n/10;
		
		while(num!=0) {
			rem=num%10;
			checkSum=checkSum+rem*2;
			num=num/10;
		}
		
		checkSum=checkSum/count;
		
		if(checkSum>9) {
			num=checkSum;
			while(num!=0) {
				rem=num%10;
				cSum=cSum+rem;
				num=num/10;
			}
			checkSum=cSum;
		}
		
		if(checkSum==checkDigit) {
			System.out.println("Success");
			return;
		}else {
			System.out.println("Fail");
			return;
		}
	}

}
