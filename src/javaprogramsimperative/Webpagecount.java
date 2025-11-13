package javaprogramsimperative;

public class Webpagecount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=webPageCount(23);
		System.out.println(ans);
		
		ans=webPageCount(9);
		System.out.println(ans);
		
		ans=webPageCount(15);
		System.out.println(ans);

	}
	
	public static int webPageCount (int items) {
		
		return (items+9)/10;
	}

}
