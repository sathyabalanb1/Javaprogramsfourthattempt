package javaprogramsimperativevtwo;

import java.util.Arrays;

public class Subarraymaxsumvtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {-2,1,-3,4,-1,2,1,-5,4};
		
		int b[] = {};
		
		int c[] = {-4,3,-2,0,-1,4,-2,5,-1,-3};
		
		int d[] = {-6,-10,-3,64,-40,-4};
		
		int ans[];
		ans=subArrayMaxSum(a);
		System.out.println(Arrays.toString(ans));
		
		ans=subArrayMaxSum(b);
		System.out.println(Arrays.toString(ans));
		
		ans=subArrayMaxSum(c);
		System.out.println(Arrays.toString(ans));
		
		ans=subArrayMaxSum(d);
		System.out.println(Arrays.toString(ans)); 


	}
	
	public static int [] subArrayMaxSum (int x[]) {
		
		if(x==null || x.length==0) {
			return x;
		}
		
		int i=0,j=0,sum=0,maxSum=x[0],start=0,end=0,count=0,total=0;
		
		int output[];
		
		while(i<x.length) {
			j=i;
			while(j<x.length) {
				sum=sum+x[j];
				count++;
				if(maxSum<sum) {
					maxSum=sum;
					start=i;
					end=j;
					total=count;
				}
				j++;
			}
			i++;
			count=0;
			sum=0;
		}
		output=copyElements(x,start,end,total);
		return output;
	}
	
	public static int [] copyElements (int input[],int st,int ed,int size) {
		
		int i=st,j=0;
		
		int op[] = new int[size];
		
		while(i<=ed) {
			op[j]=input[i];
			i++;
			j++;
		}
		
		return op;
	}

}
