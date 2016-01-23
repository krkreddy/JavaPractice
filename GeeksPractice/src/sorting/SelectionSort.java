package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements=new int[]{10,87,7,23,3,54,12};
		int[] output;
		int j=0;
		
		output=selectionSort(elements);
		while(j<elements.length){
			System.out.println("Selection: "+output[j]);
			j++;
		}
		
		//System.out.println(elements[3]);
	}

	private static int[] selectionSort(int[] elements) {
		int l=elements.length;
		int pos;
		int temp;
		int i=0;
		while(i<l-1){
			pos=smallest(i,elements);
			temp=elements[pos];
			elements[pos]=elements[i];
			elements[i]=temp;
			i++;
		}
		return elements;
	}

	private static int smallest(int i, int[] elements) {
		int l=elements.length;
		int least=elements[i];
		int index = 0;
		while(i<l){
			if(elements[i] <= least){
				least=elements[i];
				index=i;
				i++;
			}
			else i++;
		}
		return index;
	}

}
