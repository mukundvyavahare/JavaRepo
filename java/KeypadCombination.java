class KeypadCombination {
	
	//Create map of key board 
	
	public static String[] keyPad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
	
	public static void printCombo(String typed, int index, String combination) {
		
		//Base condition 
		if(index == typed.length())
		{
			System.out.println(combination);
			return;
		}
		
		//Kaam kerga 
		//Get current char value
		char currentChar = typed.charAt(index);
		System.out.println(currentChar);
		//Get current char value 
		String mapping = keyPad[currentChar - '0'];
		System.out.println(mapping);
		
		//Create combination with values & add in new string
		for(int i = 0; i<mapping.length(); i++)
		{
			printCombo(typed, index+1, combination+mapping.charAt(i));
		}
		
		
	}
	
	public static void main(String[] args) {
		String typed = "23";
		printCombo(typed, 0, "");
	}
}