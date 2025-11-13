package javaprogramsimperative;

public class Missingnumbervtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int missingNumberArray[];
		int missingNumber;
		
		missingNumberArray=generateArrayWithMissingNumber(50,2);
		missingNumber=findMissingNumber(missingNumberArray,50);
		System.out.println(missingNumber);
		
		missingNumberArray=generateArrayWithMissingNumber(300,299);
		missingNumber=findMissingNumber(missingNumberArray,300);
		System.out.println(missingNumber);

	}
	
	public static int[] generateArrayWithMissingNumber (int range,int missingNumber) {
		
		int i=1,index=0;
		
		int temp[]=new int[range-1];
		
		while(i<=range) {
			if(i!=missingNumber) {
				temp[index++]=i;
			}
			i++;
		}
		
		return temp;
	}
	
	public static int findMissingNumber (int x[],int n) {
		
		int expectedSum=0,actualSum=0;
		
		expectedSum = n*(n+1)/2;
		
		for(int num:x) {
			actualSum=actualSum+num;
		}
		
		return expectedSum-actualSum;
	}

}
