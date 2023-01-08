class SortArray {

	public static boolean checkSortArray(int[] arr, int index) {
		
		//Base condition
		if(index == arr.length-1)	{
			return true;
		}

		//Kaam kerga
		if(arr[index] >= arr[index + 1]){
			return false;
		} 
		
		return checkSortArray(arr, index+1);
	}
	

	public static void main(String[] args) {
	
	int[] arr = {1,3,2};
	boolean status = checkSortArray(arr, 0);
	System.out.println(status);
	
	}

}