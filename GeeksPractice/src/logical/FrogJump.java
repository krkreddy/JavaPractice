package logical;

public class FrogJump {
	
	public static int riverCrossingTime(int dist, int[] input){
		int[] location = new int[dist+1];
		int currPosition = 0;	
		for(int i=0;i<input.length;i++){
			if(location[input[i]]==0){
				location[input[i]] = input[i];
				currPosition += 1;
				if(currPosition == dist)
					return i;
			}
		}
		return -1;
	}
	
	public static void main(String args[]){
		int[] arr = {1,3,1,4,2,3,5,4};
		System.out.println(riverCrossingTime(5,arr));
	}
}
