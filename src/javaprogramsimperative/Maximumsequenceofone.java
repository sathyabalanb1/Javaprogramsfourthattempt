package javaprogramsimperative;

public class Maximumsequenceofone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,0,1,1,0,0,0,1,1,1,0,0,1,1,1,1,1,0,0,0,0,0,0};
		
		int b[]= {0,0,0,0,0,0,0};
		
		int ans;
		ans=maximumSequenceOfOne(a);
		System.out.println(ans);
		
		ans=maximumSequenceOfOne(b);
		System.out.println(ans);

	}
	
	public static int maximumSequenceOfOne (int x[]) {
		
		int i=0,j=0,count=0,maxCount=0;
		
		while(i<x.length) {
			j=i;
			while(j<x.length) {
				if(x[j]==1) {
					j++;
					count++;
				}else {
					j++;
					break;
				}
			}
			if(maxCount<count) {
				maxCount=count;
			}
			i=j;
			count=0;
		}
		
		return maxCount;
	}

}
