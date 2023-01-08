class RemoveDuplicates {
	
	public static boolean map[] = new boolean[26];
	
	public static void removeAllDuplicates(String str, int index, int n, String newString) {
		
		//Base condition
		if(n == 0) {
			System.out.println(str);
			System.out.println(newString);
			//System.out.println(duplicates);
			return;
		}
		
		
		//Kaam kerga 
		char currentChar = str.charAt(index);
		//To get the values from array need to pass integer : currentChar-'a' == value i.e. 0
		if(map[currentChar-'a'] == true) {
			//duplicates += currentChar;
			removeAllDuplicates(str,index+1, n-1, newString);
		} else {
			newString += currentChar;
			map[currentChar-'a'] = true;
			removeAllDuplicates(str, index+1, n-1, newString);
		}
		
	}
	
	public static void main(String[] args) {
		//Function call
		String str = "abbccda";
		removeAllDuplicates(str,0, str.length()-1, "");
		
	}
}