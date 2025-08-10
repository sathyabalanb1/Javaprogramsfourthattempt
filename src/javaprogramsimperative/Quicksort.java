package javaprogramsimperative;

import java.util.Arrays;

public class Quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {7,6,10,5,9,2,1,15,7};
		
		int b[] = {8,4};
		
		int c[] = {12,7,25,3,18,10};
		
		int d[] = {5};
		
		int e[] = {13,6,23,87,4,76,11,3,10,23,23,10,91,2,15,1,79,80,33};
		
		int f[] = {19,6,26,4,23};
		
		quickSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
		
		quickSort(b,0,b.length-1);
		System.out.println(Arrays.toString(b));
		
		quickSort(c,0,c.length-1);
		System.out.println(Arrays.toString(c));
		
		quickSort(d,0,d.length-1);
		System.out.println(Arrays.toString(d));
		
		quickSort(e,0,e.length-1);
		System.out.println(Arrays.toString(e));
		
		quickSort(f,0,f.length-1);
		System.out.println(Arrays.toString(f));


	}
	
	public static void quickSort (int x[],int lb,int ub) {
		
		int loc;
		
		if(lb<ub) {
			loc=partition(x,lb,ub);
			quickSort(x,lb,loc-1);
			quickSort(x,loc+1,ub);
		}
		
		return;
	}
	
	public static int partition (int x[],int lb,int ub) {
		
		int start=lb,end=ub,lower=lb,upper=ub,pivot=x[lb],pivotpos=lb,i=lb,j=ub,temp;
		
		while(start<end) {
			i=start;
			j=end;
			while(x[i]<=pivot) {
				i++;
				if(i==x.length-1) {
					break;
				}
			}
			
			while(x[j]>pivot) {
				j--;
				if(j==0) {
					break;
				}
			}
			
			if(i<j) {
				temp=x[i];
				x[i]=x[j];
				x[j]=temp;
			}
			
			start=i;
			end=j;
			
		}
		temp=x[pivotpos];
		x[pivotpos]=x[end];
		x[end]=temp;
		
		return end;
	}

}
