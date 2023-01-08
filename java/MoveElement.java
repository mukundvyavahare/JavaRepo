class MoveElement {

		public static int count = 0;
		public static String newString = "";

		public static void moveSearchElementAtLast(String str, int index, char element) {
			
			if(index == str.length()) {
				for(int i = 0; i < count; i++) {
					newString += element;
				}
				System.out.println(newString);
				return;
			}
			
			char currentChar = str.charAt(index);
			if(currentChar == element) {
				count++;
				moveSearchElementAtLast(str, index+1, element);
		
			} else {
				newString += currentChar;
				moveSearchElementAtLast(str, index+1, element);
		
			}
			
		}
		public static void main(String[] args) {
		String str = "axbcxxd";
		moveSearchElementAtLast(str, 0, 'x');
		}
}