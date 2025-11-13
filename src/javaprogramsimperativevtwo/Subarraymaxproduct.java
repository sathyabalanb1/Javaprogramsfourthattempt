package javaprogramsimperativevtwo;

import java.util.Arrays;

public class Subarraymaxproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,3,-2,4};
		
		int b[] = {};
		
		int c[] = {4,5,0,-1,3,-1,6,-3,0};
		
		int ans[];
		ans=subArrayMaxProduct(a);
		System.out.println(Arrays.toString(ans));
		
		ans=subArrayMaxProduct(b);
		System.out.println(Arrays.toString(ans));
		
		ans=subArrayMaxProduct(c);
		System.out.println(Arrays.toString(ans));


	}
	
	public static int[] subArrayMaxProduct (int x[]) {
		
		int i=0,j=0,maxProd=0,prod=1,start=0,end=0,count=0,total=0;
		
		if(x==null || x.length==0) {
			return x;
		}
		
		int output[];
		
		while(i<x.length) {
			j=i;
			while(j<x.length) {
				count++;
				prod=prod*x[j];
				if(maxProd<prod) {
					maxProd=prod;
					start=i;
					end=j;
					total=count;
				}
				j++;
			}
			count=0;
			i++;
			prod=1;
		}
		output=copyElements(x,start,end,total);
		return output;		
		
	}
	
	public static int[] copyElements (int x[],int st,int ed,int ttl) {
		
		int i=st,j=0;
		
		int temp[]=new int[ttl];
		
		while(i<=ed) {
			temp[j]=x[i];
			i++;
			j++;
		}
		
		return temp;
	}

}
