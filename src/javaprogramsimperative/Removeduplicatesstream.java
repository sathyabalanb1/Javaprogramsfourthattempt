package javaprogramsimperative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Removeduplicatesstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {23,44,16,44,39,35,44,77,18,39,23};
		
		int b[] = {1,2,3,4,5};
		
		int c[] = {7};
		
		int d[] = {};
		
		int ans[];
		ans=removeDuplicates(a);
		System.out.println(Arrays.toString(ans));
		
		ans=removeDuplicates(b);
		System.out.println(Arrays.toString(ans));
		
		ans=removeDuplicates(c);
		System.out.println(Arrays.toString(ans));
		
		ans=removeDuplicates(d);
		System.out.println(Arrays.toString(ans));


	}
	
	public static int[] removeDuplicates (int x[]) {
		
		int i=0,j=0;
		
		List<Integer>temp = new ArrayList<>();
		
		Arrays.sort(x);
		
		while(i<x.length) {
			j=i;
			temp.add(x[i]);
			while(j<x.length) {
				if(x[i]==x[j]) {
					j++;
				}else {
					break;
				}
			}
			i=j;
		}
		
		return temp.stream().mapToInt(Integer::intValue).toArray();
	}

}
