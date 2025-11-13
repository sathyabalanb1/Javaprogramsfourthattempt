package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Groupbyagevtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Editor>editorlist = Arrays.asList( new Editor(32,"Sathya"),
				new Editor(20,"Akshidha"), new Editor(35,"Nethra"),
				new Editor(35,"Bhargavan"), new Editor(20,"Hari"),new Editor(35,"Guna")
				);
		
		groupByAge(editorlist);

	}
	
	public static void groupByAge (List<Editor>editors) {
		Map<Integer,List<Editor>>output = editors.stream().
				collect(Collectors.groupingBy(Editor::getAge));
		
		System.out.println(output);
		
		return;
	}

}
