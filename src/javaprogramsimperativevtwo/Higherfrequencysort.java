package javaprogramsimperativevtwo;

import java.util.Arrays;

public class Higherfrequencysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3,3,5,5,5,8,8,26,26,26,10,10,10,10,17,16};
		
		int b[] = {5,4,3,2,1}; 
		
		int c[] = {5,3,5};
		
		int d[] = {8};
		
		higherFrequencySort(a);
		System.out.println(Arrays.toString(a));
		
		higherFrequencySort(b);
		System.out.println(Arrays.toString(b));
		
		higherFrequencySort(c);
		System.out.println(Arrays.toString(c));
		
		higherFrequencySort(d);
		System.out.println(Arrays.toString(d));

	}
	
	public static void higherFrequencySort (int x[]) {
		
		int i=0,j=0,k=0,loopstart=0,numstart=0,numend=0,count=0,total=0,maxCount=0,maxCountNumber=0;
		
		Arrays.sort(x);
		
		while(i<x.length) {
			j=i;
			while(j<x.length) {
				k=j;
				while(k<x.length) {
					if(x[j]==x[k]) {
						count++;
						k++;
					}else {
					//	System.out.println(j+","+k);
						break;
					}
				}
				if(maxCount<count) {
					maxCount=count;
					loopstart=i;
					numstart=j;
					numend=k-1;
					total=count;
					maxCountNumber=x[j];
				}else if(maxCount==count) {
					if(x[j]<maxCountNumber) {
						maxCount=count;
						loopstart=i;
						numstart=j;
						numend=k-1;
						total=count;
						maxCountNumber=x[j];
					}
				}
				j=k;
				count=0;
			}
			rotateArrayMultiple(x,loopstart,numstart,numend,total);
			i=i+total;
		//	System.out.println(loopstart+","+numstart+","+numend);
			loopstart=0;
			numstart=0;
			numend=0;
			total=0;
			maxCount=0;
			count=0;
		}
		return;
	}
	
	public static void rotateArrayMultiple(int x[],int loopstart,int numstart,int numend,int total) {
		
		int i=0;
		
		while(i<total) {
			rotateArray(x,loopstart,numstart,numend);
			i++;
		}
		
		return;
	}
	
	public static void rotateArray(int x[],int loopst,int numst,int numed) {
		
		int i=numed,j=numed-1,temp=x[numed];
		
		while(i>loopst) {
			x[i]=x[j];
			i--;
			j--;
		}
		x[loopst]=temp;
		return;
	}

}
