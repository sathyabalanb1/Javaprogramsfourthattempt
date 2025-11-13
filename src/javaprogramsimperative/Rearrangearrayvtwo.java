package javaprogramsimperative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rearrangearrayvtwo {

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
		
		List<Integer>pos=new ArrayList<>();
		List<Integer>neg=new ArrayList<>();
		
		for(int num:x) {
			if(num<0) {
				neg.add(num);
			}else {
				pos.add(num);
			}
		}
		
		boolean indicator=x[0]>=0;
		
		while(j<pos.size() && k<neg.size()) {
			if(indicator) {
				x[l]=pos.get(j);
				j++;
				l++;
			}else {
				x[l]=neg.get(k);
				k++;
				l++;
			}
			indicator=!indicator;
		}
		
		while(j<pos.size()) {
			x[l]=pos.get(j);
			j++;
			l++;
		}
		
		while(k<neg.size()) {
			x[l]=neg.get(k);
			k++;
			l++;
		}
		
		return;
	}

}
