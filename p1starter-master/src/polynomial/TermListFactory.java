package polynomial;

import list.ArrayListFactory;
import list.ListFactory;

public class TermListFactory {
	private static  String factory = "array";
	
	public static ListFactory<Term> newListFactory(){
		// Return a factory for ArrayList
	
			return new ArrayListFactory<Term>();
		
		
	}

	public static void setFactory(String newValue) {
		factory = newValue;
	}

}
