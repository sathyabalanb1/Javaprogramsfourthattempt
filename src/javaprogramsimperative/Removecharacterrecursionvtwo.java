package javaprogramsimperative;

public class Removecharacterrecursionvtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ans;
		ans=removeCharacterRecursion("sathyabalan",'a');
		System.out.println(ans);
		
		ans=removeCharacterRecursion(null,'a');
		System.out.println(ans);
		
		ans=removeCharacterRecursion("bavithra",'s');
		System.out.println(ans);
		
		ans=removeCharacterRecursion("",'s');
		System.out.println(ans);
		
		ans=removeCharacterRecursion("indhumathi",'i');
		System.out.println(ans);
		
		ans=removeCharacterRecursion("iiiiiiiii",'i');
		System.out.println(ans.isEmpty());

	}
	
	public static String removeCharacterRecursion (String str, char ch) {
		
				
		if(str==null || str.isEmpty()) {
			return str;
		}
		
		int i=0,j=str.length()-1;
		
		char c=str.charAt(i);
		
		if(ch==c) {
		 return removeCharacterRecursion(str.substring(i+1),ch);
		}
		
		return c+removeCharacterRecursion(str.substring(i+1),ch);
	}

}
