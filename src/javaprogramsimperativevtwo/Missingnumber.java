package javaprogramsimperativevtwo;

import java.util.Arrays;

public class Missingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int missingNumberArray[];
		int ans;
		missingNumberArray=generateArrayWithMissingNumber(200,47);
		ans=findMissingNumber(missingNumberArray,200);
		System.out.println(ans); 
		
		missingNumberArray=generateArrayWithMissingNumber(10,1);
		ans=findMissingNumber(missingNumberArray,10);
		System.out.println(ans);

	}
	
	public static int[] generateArrayWithMissingNumber (int range,int missingNumber) {
		
		int temp[]=new int[range-1];
		
		int i=1,j=0;
		
		while(i<=range) {
			if(i!=missingNumber) {
				temp[j]=i;
				j++;
			}
			i++;
		}
		
		return temp;
	}
	
	public static int findMissingNumber (int input[],int range) {
		
		int n=range,expectedSum,actualSum=0,i=0,missingNumber;
		
		expectedSum=n*(n+1)/2;
		
		while(i<input.length) {
			actualSum=actualSum+input[i];
			i++;
		}
		
		missingNumber=expectedSum-actualSum;
		
		return missingNumber;
	}

}
