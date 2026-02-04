package javaprogramsimperativevtwo;

import java.util.Arrays;

public class Longestsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10,20,30,40,100,200};
		
		int b[] = {5,6,8,10,11,12,13,15,20,21,22,26};
		
		int c[] = {33,34,35,36,37,50,55};
		
		int d[] = {5,9,10,16,20,21,22};
		
		int e[] = {};
		
		int f[] = {10,11,25,28,29,30,31,90,95,120,121,122};
		
		int g[] = {10,11,12,13,100,200};
		
		int ans[];
		ans=longestSequence(a);
		System.out.println(Arrays.toString(ans));
		
		ans=longestSequence(b);
		System.out.println(Arrays.toString(ans));
		
		ans=longestSequence(c);
		System.out.println(Arrays.toString(ans));
		
		ans=longestSequence(d);
		System.out.println(Arrays.toString(ans));
		
		ans=longestSequence(e);
		System.out.println(Arrays.toString(ans));
		
		ans=longestSequence(f);
		System.out.println(Arrays.toString(ans)); 
		
		ans=longestSequence(g);
		System.out.println(Arrays.toString(ans)); 


	}
	
	public static int[] longestSequence (int x[]) {
		
		int i=0,j=0,k=0,start=0,end=0,count=0,max=0;
		
		int output[];
		
		Arrays.sort(x);
		
		while(i<x.length-1) {
			j=i;
			while(j<x.length-1) {
				k=j+1;
				if(x[j]+1==x[k]) {
					count++;
					j++;
				}else if(j==0) {
					break;
				}else if(j!=0) {
					if(x[j]-1==x[j-1]) {
						count++;
						break;
					}else {
						break;
					}
				}
			}
			if(j==x.length-1) {
				if(x[j]-1==x[j-1]) {
					count++;
				}
			}
			if(max<count) {
				start=i;
				end=j;
				max=count;
			}
			i=k;
			count=0;
		}
		
		if(max==0) {
			return x;
		}else {
			output=copyElements(x,start,end,max);
			return output;
		}
		
		
	}
	
	public static int[] copyElements(int x[],int start,int end,int total) {
		
		int i=start,j=0;
		
		int result[]=new int[total];
		
		while(i<=end) {
			result[j]=x[i];
			i++;
			j++;
		}
		
		return result;
	}

}
