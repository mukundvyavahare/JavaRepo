class RunInsertion {
	
	public static void main(String[] args) {
		
		int[] elements = {7,8,3,1,2};
		
		for(int i=1; i<elements.length; i++)
		{
			//Suppose first element is already sorted and remaining unsorted 
			//Start from first index
			//Current = 7
			int current = elements[i];
			// compare with previous element and place element in sort place
			int j = i-1;
			//iterate loop untill loop terminates or next element is less then current 
			while(j>=0 && current < elements[j]) {
				
				elements[j+1] = elements[j];
				j--;
				
			}
			
			//placement
			elements[j+1] = current;
		}
		printArray(elements);
	}
	
	public static void printArray(int[] array) {
		for(int value : array) {
			System.out.println(value);
		}
	}
}