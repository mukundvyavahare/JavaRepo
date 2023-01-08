class ReverseString {
	
	
	public static void printReverseStr(String str, int index) {
		
		if(index == 0) {
			System.out.print(str.charAt(index));
			return;
		}
		System.out.print(str.charAt(index));
		
		printReverseStr(str, index-1);
		
	}
	
	
	public static void main(String[] args) {
		
		String str = "abcd";
		
		printReverseStr(str, str.length()-1);
		
	}
}