package dynamicProgramming;

public class EditDistance {
	
	private int[][] tracker;
	
	public int numberOfOperations(String input, String output){
		int x = input.length();
		int y = output.length();
		tracker = new int[x][y];
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				if(j == 0)
					tracker[i][j] = i;
				else if(i == 0)
					tracker[i][j] = j;
				else if(input.charAt(i) == output.charAt(j))
					tracker[i][j] = tracker[i-1][j-1];
				else
					tracker[i][j] = minimum(tracker[i][j-1],tracker[i-1][j-1],tracker[i-1][j]);
			}
		}
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				System.out.print(tracker[i][j]+" ");
			}
			System.out.println();
		}
		return tracker[x-1][y-1];
	}
	
	public int minimum(int x, int y, int z){
		return (x>y && z>y) ? y:((y>x && z>x) ? x:z);
	}

	public static void main(String[] args){
		EditDistance ed = new EditDistance();
		System.out.println(ed.numberOfOperations("ramakrishna", "reddy"));
	}
}
