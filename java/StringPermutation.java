class StringPermutation {

	public static void permutation(String str, String p) {
		
		if(str.length() == 0) {
			return;
		
		}


		for(int i=0; i<str.length(); i++) {
			System.out.println(i);
			char currentChar = str.charAt(i);
			System.out.println(currentChar);
			String newString = str.substring(0, i) + str.substring(i+1);
			//System.out.println(str.substring(i+1));
			System.out.println(newString);
			if((p+currentChar).equals("cba")) {
				System.out.println("cba");
				break;
			}
			
			permutation(newString, p+currentChar);
		}
	}
	public static void main(String[] args) {
	String str = "abc";
	permutation(str, "");
	
	}
}