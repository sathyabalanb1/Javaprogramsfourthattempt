package javaprogramsimperative;

import java.util.Arrays;

public class Longestsequencevtwo {

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
		
		int i=0,j=0,k=0,start=0,end=0,count=0,total=0;
		
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
					j++;
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
				}else {
					break;
				}
			}
			
			if(total<count) {
				total=count;
				start=i;
				end=j;
			}
			i=k;
			count=0;
		}
		
		if(total==0) {
			return x;
		}else {
			output=copyElements(start,end,total,x);
			return output;
		}
	}
	
	public static int[] copyElements (int st,int ed,int sum,int input[]) {
		
		int i=st,j=0;
		
		int temp[] = new int[sum];
		
		while(i<=ed) {
			temp[j]=input[i];
			i++;
			j++;
		}
		
		return temp;
	}

}
