class findElementOccurence {

	public static int first = -1;
	public static int last = -1;

	public static void findOccurenceOfElement(String str, int index, char element) {
		
		//Base condition
		if(index == str.length()) {
			System.out.println(first);
			System.out.println(last);	
			return;
			
		}

		//Kaam Kerga
		char currentElement = str.charAt(index);
		if(currentElement == element) {
			if(first == -1) {
				first = index;
			}else {
				last = index;
			}

		}
		//Recursion
		findOccurenceOfElement(str, index+1, element);
	
	}

	public static void main(String[] args){
	//Function call
	String str = "abaacdaefaah";
	
	findOccurenceOfElement(str, 0, 'a');
	}
}