package logical;

public class FrogJumpVariable {
	
	public static int riverCrossingTime(int dist, int jump, int[] input){
		int[] location = new int[dist+jump];
		int currPosition = 0;	
		int track=jump;
		for(int i=0;i<input.length;i++){
			if(location[input[i]]==0 && input[i]>currPosition){
				System.out.println("Input is "+input[i]+" currPosition is "+currPosition+" and i is "+i);
				location[input[i]] = input[i];
				while(track > 0){
					if(currPosition+track < dist+jump && location[currPosition+track] != 0){
						currPosition = currPosition+track;
						track = jump;
					}
					else
						track--;
				}
				System.out.println("currPosition is "+currPosition);
				if(currPosition >= dist)
					return i;
				track = jump;
			}
		}
		return -1;
	}
	
	public static void main(String args[]){
//		int[] arr = {1,3,2,7,3,4,8,6,5,4,5,7,2,4,6,8};
		int[] arr = {1,2,8,4,5,6,7,2,9,1,2,3,4,5,6,7,8};
		System.out.println(riverCrossingTime(8,3,arr));
	}
}
