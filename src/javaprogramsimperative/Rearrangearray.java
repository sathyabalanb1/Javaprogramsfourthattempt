package javaprogramsimperative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rearrangearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1, -2, 3, -4, -5, 6, -7};
		
		int b[]= {-1, 2, -3, 4, 5, -6};
		
		int c[]= {-7,2,5,6,1,-8,-2,-19,-22,-7,4,-99,-83};
		
		int d[]= {6,-8,-14,9,3,1,12,20,34,40};
		
		reArrangeArray(a);
		System.out.println(Arrays.toString(a));
		
		reArrangeArray(b);
		System.out.println(Arrays.toString(b));
		
		reArrangeArray(c);
		System.out.println(Arrays.toString(c));
		
		reArrangeArray(d);
		System.out.println(Arrays.toString(d));

	}
	
	public static void reArrangeArray (int x[]) {
		
		int i=0,j=0,k=0,l=0;
		
		List<Integer>posNumbers = new ArrayList<>();
		List<Integer>negNumbers = new ArrayList<>();
		
		for(int num:x) {
			if(num<0) {
				negNumbers.add(num);
			}else {
				posNumbers.add(num);
			}
		}
		
		boolean indicator = x[0]>=0;
		
		while(j<posNumbers.size() && k<negNumbers.size()) {
			if(indicator) {
				x[l]=posNumbers.get(j);
				j++;
				l++;
			}else {
				x[l]=negNumbers.get(k);
				k++;
				l++;
			}
			
			indicator=!indicator;
		}
		
		while(j<posNumbers.size()) {
			x[l]=posNumbers.get(j);
			j++;
			l++;
		}
		
		while(k<negNumbers.size()) {
			x[l]=negNumbers.get(k);
			k++;
			l++;
		}
		
		return;
	}

}
