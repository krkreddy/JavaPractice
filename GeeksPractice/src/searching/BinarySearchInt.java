package searching;

public class BinarySearchInt {
	private int[] arr;
	
	public BinarySearchInt(int n){
		arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = i;
	}
	
	public int binarySearch(int value){
		int min = 0;
		int max = arr.length-1;
		int mid = (min+max)/2;
		while(true){
			if(min == max && arr[min] != value)
				return -1;
			if(arr[mid] == value)
				return mid;
			else if (arr[mid] > value){
				max = mid-1;
			}
			else{
				min = mid+1;
			}
			mid = (min+max)/2;
		}
	}
	
	public static void main(String[] args){
		int n = 10;
		BinarySearchInt bsi = new BinarySearchInt(n);
		System.out.println("Location of value 8 is "+bsi.binarySearch(8));
	}

}
