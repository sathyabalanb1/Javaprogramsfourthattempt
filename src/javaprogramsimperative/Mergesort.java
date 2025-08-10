package javaprogramsimperative;

import java.util.Arrays;

public class Mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {15,5,24,8,1,3,16,10,20};
		
		int b[] = {8,3};
		
		int c[] = {7};
		
		int d[] = {1,2,3,4,5};
		
		int e[] = {23,96,17,65,42,21,90,87,3,17,17,65,76,9,15,100,90};
		
		mergeSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
		
		mergeSort(b,0,b.length-1);
		System.out.println(Arrays.toString(b));
		
		mergeSort(c,0,c.length-1);
		System.out.println(Arrays.toString(c));
		
		mergeSort(d,0,d.length-1);
		System.out.println(Arrays.toString(d));
		
		mergeSort(e,0,e.length-1);
		System.out.println(Arrays.toString(e));

	}
	
	public static void mergeSort (int x[],int lb,int ub) {
		
		int mid;
		
		if(lb<ub) {
			mid=(lb+ub)/2;
			mergeSort(x,lb,mid);
			mergeSort(x,mid+1,ub);
			merge(x,lb,mid,mid+1,ub);
		}
		
		return;
		
	}
	
	public static void merge (int x[],int lb,int mid,int midplus,int ub) {
		
		int i=lb,j=midplus,k=0,l=0,m=lb;
				
		int temp[] = new int[ub-lb+1];
				
		while(i<=mid && j<=ub) {
			if(x[i]<x[j]) {
				temp[k]=x[i];
				i++;
				k++;
			}else {
				temp[k]=x[j];
				j++;
				k++;
			}
		}
		
		while(i<=mid) {
			temp[k]=x[i];
			i++;
			k++;
		}
		
		while(j<=ub) {
			temp[k]=x[j];
			j++;
			k++;
		}
		
		while(l<temp.length) {
			x[m]=temp[l];
			l++;
			m++;
		}
		
		return;
	}

}
