package sorting;

public class SelectionSortInt {
	
	public static void selectionSort(int[] array){
		int n = array.length;
		int min;
		int temp;
		if(n == 0){
			System.out.println("Array is empty");
			return;
		}
		for(int i=0;i<n-1;i++){
			min = i;
			for(int j=i;j<n;j++){
				if(array[min] > array[j])
					min = j;
			}
			temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
	}
	
	public static void main(String[] args){
		int[] array = {4,2,5,1,6,9,3,8};
		selectionSort(array);
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
	}

}
