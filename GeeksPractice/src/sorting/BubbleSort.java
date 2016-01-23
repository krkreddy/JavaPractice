package sorting;

public class BubbleSort {
	
	public static void swap(int pos, int[] elements){
		int temp;
		temp = elements[pos];
		elements[pos]=elements[pos+1];
		elements[pos+1]=temp;
	}
	
	public static int[] bubbleSort(int[] elements){
		int len=elements.length;
		for(int i=len;i>0;i--){
			for(int j=0;j<i-1;j++){
				if(elements[j]>elements[j+1]){
					swap(j,elements);
					// Print each element for understanding
					int k=0;
					while(k<elements.length){
						System.out.print(elements[k]+" ");
						k++;
					}
					System.out.println(); // New line after each array print
				}
				else System.out.println("No Operation");
			}
			System.out.println("---Inner Loop Completed :)---");//tracking
		}
		return elements;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[]{10,57,8,12,75,45,23,9};
		int[] output;
		int k=0;
		output=bubbleSort(numbers);
		while(k<output.length){
			System.out.println("Bubble: "+output[k]);
			k++;
		}
	}

}
