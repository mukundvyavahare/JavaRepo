class SubSequenceElement {
	
	public static void callSubsequence(String str, int index, String newString) {
		
		//Base
		if(index == str.length()) {
			System.out.println(newString);
			return;
		}
		
		char currentChar = str.charAt(index);
		//To be
		
		callSubsequence(str, index+1, newString+currentChar);
		
		//Not to be
		callSubsequence(str, index+1, newString);
	}
	
	public static void main(String[] args) {
		String str = "abc";
		callSubsequence(str, 0, "");
		
	}
}