package javaprogramsimperativevtwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Commonnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,5,10,20,40,80};
		int b[] = {6,7,20,80,100};
		int c[] = {3,4,15,20,30,70,80,120};
		
		int d[] = {1,2,3,4,5};
		int e[] = {6,7,8,9,10};
		int f[] = {11,12,13,14,15};
		
		int g[] = {};
		int h[] = {};
		int i[] = {};
		
		int j[] = {2,4,4,4,8,10,12,16,16};
		int k[] = {4,4,8,9,9,9,10,16,16,16};
		int l[] = {4,4,4,4,8,8,8,12,16}; 
		
		int finalOutput[];
		int firstOutput[];
		
		firstOutput=commonNumbers(a,b);
		finalOutput=commonNumbers(firstOutput,c);
		System.out.println(Arrays.toString(finalOutput));
		
		firstOutput=commonNumbers(d,e);
		finalOutput=commonNumbers(firstOutput,f);
		System.out.println(Arrays.toString(finalOutput));
		
		firstOutput=commonNumbers(g,h);
		finalOutput=commonNumbers(firstOutput,i);
		System.out.println(Arrays.toString(finalOutput));
		
		firstOutput=commonNumbers(j,k);
		finalOutput=commonNumbers(firstOutput,l);
		System.out.println(Arrays.toString(finalOutput)); 
		


	}
	
	public static int[] commonNumbers (int x[],int y[]) {
		
		int i=0,j=0,num1,num2;
		
		List<Integer>output = new ArrayList<>();
		
		while(i<x.length && j<y.length) {
			num1=x[i];
			num2=y[j];
			if(x[i]==y[j]) {
				if(output.isEmpty() || output.get(output.size()-1) !=x[i]) {
					output.add(x[i]);
				}
				i++;
				j++;
			}else if(x[i]>y[j]) {
				j++;
			}else if(x[i]<y[j]) {
				i++;
			}
		}
		
		return output.stream().mapToInt(Integer::intValue).toArray();
	}

}
