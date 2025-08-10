package javaprogramsimperative;

import java.util.Arrays;

public class Removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {23,44,16,44,39,35,44,77,18,39,23};
		
		int b[] = {1,2,3,4,5};
		
		int c[] = {7};
		
		int d[] = {};
		
		int ans[];
		ans=removeDuplicates(a);
		System.out.println(Arrays.toString(ans));
		
		ans=removeDuplicates(b);
		System.out.println(Arrays.toString(ans));
		
		ans=removeDuplicates(c);
		System.out.println(Arrays.toString(ans));
		
		ans=removeDuplicates(d);
		System.out.println(Arrays.toString(ans));


	}
	
	public static int uniqueNumbersCount (int x[]) {
		
		int i=0,j=0,uniqueNumbers=0;
		
		Arrays.sort(x);
		
		while(i<x.length) {
			j=i;
			uniqueNumbers++;
			while(j<x.length) {
				if(x[i]==x[j]) {
					j++;
				}else {
					break;
				}
			}
			i=j;
		}
		
		return uniqueNumbers;
	}
	
	public static int[] removeDuplicates (int x[]) {
		
		int i=0,j=0,k=0,uniqueCount=0;
		
		uniqueCount=uniqueNumbersCount(x);
		
		int output[]=new int[uniqueCount];
		
		while(i<x.length) {
			j=i;
			output[k]=x[i];
			while(j<x.length) {
				if(x[i]==x[j]) {
					j++;
				}else {
					break;
				}
			}
			i=j;
			k++;
		}
		
		return output;
	}

}
