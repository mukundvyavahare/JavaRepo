import java.util.HashSet;
class UniqueSubSequenceElement {
	
	public static void callSubsequence(String str, int index, String newString, HashSet<String> set) {
		
		//Base
		if(index == str.length()) {
			if(set.contains(newString)) {
				return;
			}else {
			System.out.println(newString);
			set.add(newString);
			return;
			}
		}
		
		char currentChar = str.charAt(index);
		//To be
		
		callSubsequence(str, index+1, newString+currentChar, set);
		
		//Not to be
		callSubsequence(str, index+1, newString, set);
	}
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		String str = "aaa";
		callSubsequence(str, 0, "", set);
		
	}
}