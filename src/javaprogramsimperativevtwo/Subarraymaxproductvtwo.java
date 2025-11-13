package javaprogramsimperativevtwo;

import java.util.Arrays;

public class Subarraymaxproductvtwo {

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
		
		if(x==null || x.length==0) {
			return x;
		}
		
		int i=0,j=0,maxProd=x[0],prod=1,start=0,end=0,count=0,total=0;
		
		int output[];
		
		while(i<x.length) {
			j=i;
			while(j<x.length) {
				prod=prod*x[j];
				count++;
				if(maxProd<prod) {
					maxProd=prod;
					start=i;
					end=j;
					total=count;
				}
				j++;
			}
			i++;
			prod=1;
			count=0;
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
