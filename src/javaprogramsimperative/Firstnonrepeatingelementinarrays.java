package javaprogramsimperative;

import java.util.LinkedHashMap;
import java.util.Map;

public class Firstnonrepeatingelementinarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {7,4,7,4,2,1,3,2,5};
		
		int b[] = {1,1,2,2,3,3,4,4,5,5};
		
		int c[] = {12};
		
		int d[]=null;
		
		int e[]= {};
		
		firstNonRepeatingElement(a);
		firstNonRepeatingElement(b);
		firstNonRepeatingElement(c);
		firstNonRepeatingElement(d);
		firstNonRepeatingElement(e);
	}
	
	public static void firstNonRepeatingElement (int x[]) {
		
		if(x==null || x.length==0) {
			System.out.println("Invalid Input");
			return;
		}
		
		Map<Integer,Integer>countMap = new LinkedHashMap<>();
		
		for(int num:x) {
			countMap.put(num, countMap.getOrDefault(num, 0)+1);
		}
		
		for(int num:x) {
			if(countMap.get(num)==1) {
				System.out.println("First Non Repeated Element: "+num);
				return;
			}
		}
		
		System.out.println("All elements in the array are repeated");
		return;
	}

}
