package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements=new int[]{10,87,7,23,3,54,12};
		int[] output;
		int j=0;
		
		output=insertionSort(elements);
		while(j<elements.length){
			System.out.println("Insertion: "+output[j]);
			j++;
		}
	}
	
	public static int[] insertionSort(int[] elements){
		int count=0;
		for(int pos=1;pos<elements.length;pos++){
			int curCount=pos;
			while(curCount>0 && elements[curCount]<elements[curCount-1]){
				swap(curCount, elements);
				curCount=curCount-1;
				count+=1;
			}
		}
		System.out.println("Number of swaps: "+count);
		return elements;
	}
	
	public static void swap(int cur, int[] elements){
		int temp;
		temp = elements[cur];
		elements[cur] = elements[cur-1];
		elements[cur-1] = temp;
	}

}
