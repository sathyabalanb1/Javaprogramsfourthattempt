package javaprogramsimperative;

import java.util.Arrays;

public class Higherfrequencysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,5,8,10,10,10,10,4,4,25,25,25,6};
		
		int b[] = {10,9};
		
		int c[] = {7};
		
		int d[] = {15,15,15,8,8,20,20,20,20,7,7,33,33,33,17,95,76};
		
		int e[] = {1,2,3,4,5};
		
		higherFrequencySort(a);
		System.out.println(Arrays.toString(a));
		
		higherFrequencySort(b);
		System.out.println(Arrays.toString(b));
		
		higherFrequencySort(c);
		System.out.println(Arrays.toString(c));
		
		higherFrequencySort(d);
		System.out.println(Arrays.toString(d));
		
		higherFrequencySort(e);
		System.out.println(Arrays.toString(e));



	}
	
	public static void higherFrequencySort (int x[]) {
		
		int i=0,j=0,k=0,loopst=0,numst=0,numed=0,count=0,total=0,bignumber=0;
		
		Arrays.sort(x);
		
		while(i<x.length) {
			j=i;
			while(j<x.length) {
				k=j;
				while(k<x.length) {
					if(x[j]==x[k]) {
						count++;
					}else {
						break;
					}
					k++;
				}
				if(total<count) {
					total=count;
					loopst=i;
					numst=j;
					numed=k-1;
					bignumber=x[j];
				}else if(total==count) {
					if(x[j]<bignumber) {
						total=count;
						loopst=i;
						numst=j;
						numed=k-1;
					}
				}
				j=k;
				count=0;
			}
			rotateArrayMultiple(x,loopst,numst,numed,total);
			i=i+total;
			loopst=0;
			numst=0;
			numed=0;
			total=0;
			count=0;
		}
		
		return;
	}
	
	public static void rotateArrayMultiple (int x[],int loopst,int numst,int numed,int total) {
		int i=0;
		
		while(i<total) {
			rotateArray(x,loopst,numst,numed);
			i++;
		}
		
		return;
	}
	
	public static void rotateArray (int x[],int loopst,int numst,int numed) {
		
		int i=numed,j=numed-1,num=x[numed];
		
		while(i>loopst) {
			x[i]=x[j];
			i--;
			j--;
		}
		x[loopst]=num;
		return;
	}

}
