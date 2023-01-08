//Find the number of ways in which you can invite n people to your party
// Single or in pair

class BackTrackingProblem3 {
	
	public static int guestCall(int guest) {
		
		//Base condition
		if(guest <= 1) {
			return 1;
		}
		
		
		//Kaam kerga 
		int single = guestCall(guest-1);
		
		int guestInPair = (guest-1) * guestCall(guest-2);
		
		return single + guestInPair;
		
		
	}
	
	public static void main(String[] args) {
		int numberOfGuest = 4;
		int totalWays = guestCall(numberOfGuest);
		System.out.println(totalWays);
	}
}