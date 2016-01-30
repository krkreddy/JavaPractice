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
					if(currPosition+jump >= dist)
						return i;
					else if(currPosition+track < dist+jump && location[currPosition+track] != 0){
						currPosition = currPosition+track;
						track = jump;
					}
					else
						track--;
				}
				System.out.println("currPosition is "+currPosition);
//				if(currPosition >= dist)
//					return i;
				track = jump;
			}
		}
		return -1;
	}
	
	public static void main(String args[]){
		int[] arr = {1,3,2,7,3,4,8,6,5,4,5,7,2,4,6,8};
//		int[] arr = {1,3,1,1,2,5};
		System.out.println(riverCrossingTime(8,2,arr));
	}
}

//class Solution {
//    public int solution(int[] A, int X, int D) {
//        int N = A.length;
//        int[] leavesPosition = new int[X+D]; // Keeps track of the leaves falling position
//        int currPosition = 0;
//        int track = D;
//        if( X <= D)
//            return 0;
//        else{
//            for(int i=0;i<N;i++){
//                if(leavesPosition[A[i]] == 0 && A[i] > currPosition){
//                    leavesPosition[A[i]] = A[i];
//                    while(track > 0){
//                        if(currPosition+D >= X)
//                            return i;
//                        else if(currPosition+track < D+X && leavesPosition[currPosition+track] != 0){
//                            currPosition = currPosition+track;
//                            track = D;
//                        }
//                        else{
//                            track--;
//                        }
//                    }
//                    if(currPosition >= X)
//                        return i;
//                    track = D;
//                }
//            }
//        }
//    return -1;
//    }
//}
