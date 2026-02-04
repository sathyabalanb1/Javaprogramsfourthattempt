package javaprogramsimperativevtwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Removeoccurrenceofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {26,8,15,3,8,9,2,4,8,8,8};
		
		int b[] = {1,2,3,4,5};
		
		int ans[];
		ans=removeOccurrence(a,8);
		System.out.println(Arrays.toString(ans));
		
		ans=removeOccurrence(b,12);
		System.out.println(Arrays.toString(ans));

	}
	
	public static int [] removeOccurrence (int x[],int n) {
		
		int i=0;
		
		List<Integer>temp = new ArrayList<>();
		
		while(i<x.length) {
			if(x[i]!=n) {
				temp.add(x[i]);
			}
			i++;
		}
		
		return temp.stream().mapToInt(Integer::intValue).toArray();
	}

}
