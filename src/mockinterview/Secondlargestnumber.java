package mockinterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Secondlargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {8,5,16,22,10,26,9,12,26};
		
		int b[]= {8,5,16,22};
		
		List<Integer>inputlist=Arrays.asList(8,5,16,22,10,26,9,12);
		
	//	secondLargestNumber(a,2);
		
	//	secondHighestNumber(inputlist);
		
	//	secondMaxNumber(a);
		
		secondMaxNumber(b);

	}
	
	public static void secondLargestNumber (int x[],int k) {
		
		int i=0,j=0,temp,big=x[0],bigpos=0;
		
		if(x==null ||x.length==0) {
			System.out.println("Invalid input");
			return;
		}
		
		while(i<x.length) {
			j=i;
			big=x[i];
			bigpos=i;
			while(j<x.length) {
				if(big<x[j]) {
					big=x[j];
					bigpos=j;
					break;
				}
				j++;
			}
			temp=x[i];
			x[i]=x[bigpos];
			x[bigpos]=temp;
			i++;
		}
		
		System.out.println(x[k-1]);
		return;
		
		
	}
	
	public static void secondHighestNumber(List<Integer>input) {
		
		Optional<Integer>output = input.stream().sorted(
				  Comparator.reverseOrder()).distinct().skip(1).findFirst();
		
		output.ifPresentOrElse(System.out::println, ()->System.out.println("None"));
		return;
	}
	
	public static void secondMaxNumber (int x[]) {
		
	//	{8,5,16,22,10,26,9,12,26};
		
		int firstMax=Integer.MIN_VALUE,secondMax=Integer.MIN_VALUE;
		
		for(int num: x) {
			if(num>firstMax) {
				firstMax=num;
			}else if(num>secondMax && num<firstMax){
				secondMax=firstMax;
			}
			
		}
		
		if(secondMax==Integer.MIN_VALUE) {
			System.out.println("Second Max is Not available");
			return;
		}else {
			System.out.println("Second Max is: "+secondMax);
		}
	}

}
