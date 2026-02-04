package javaprogramsimperative;

public class Countcharacterswithoutloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=countCharactersWithoutLoop("sathyabalan");
		System.out.println(ans);
		
		ans=countCharactersWithoutLoop("");
		System.out.println(ans);
		
		ans=countCharactersWithoutLoop("Reshma");
		System.out.println(ans);

	}
	
	public static int countCharactersWithoutLoop (String str) {
		
		if(str.isEmpty()) {
			return 0;
		}
		
		return 1+countCharactersWithoutLoop(str.substring(1));
	}

}
