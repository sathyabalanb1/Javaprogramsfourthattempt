package javaprogramsimperative;

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
		
		expectedSum= n*(n+1)/2;
		
		for(int num:x) {
			actualSum=actualSum+num;
		}
		
		return expectedSum-actualSum;
	}

}
