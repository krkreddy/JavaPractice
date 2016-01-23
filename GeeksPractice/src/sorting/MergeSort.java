package sorting;

public class MergeSort {
	
	public static int[] mergeSort(int beg, int end, int[] elements){
		if(beg<end){
			int mid=(beg+end)/2;
			//System.out.println(beg+" "+mid);
			mergeSort(beg, mid, elements);
			mergeSort(mid+1, end, elements);
			merging(beg,mid,end,elements);
		}
		return elements;
	}

	private static void merging(int beg, int mid, int end, int[] elements) {
		int[] temp = new int[elements.length];
//		System.out.print("initial: ");
//		for(int i=beg;i<=end;i++){
//			temp[i]=elements[i];
//			System.out.print(temp[i]+" ");//Tracking
//		}
//		System.out.println();
		int i=beg;
		int j=mid+1;
		int k=beg;
		while(i<=mid && j<=end){
			if(temp[i]>temp[j]){
				elements[k]=temp[j];
				j++;
			}
			else{
				elements[k]=temp[i];
				i++;
			}
			k++;
		}
		
		while(i<=mid){
			elements[k]=temp[i];
			i++;
			k++;
		}
//		System.out.print("finale: ");
//		for(int z=beg;z<=end;z++){
//			System.out.print(elements[z]+" ");//Tracking
//		}
//		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int elements[] = new int[]{21,11,10,9,23,2,4,25,26,27};
		int output[];
		output = mergeSort(0, (elements.length)-1, elements);
		for(int i=0;i<output.length;i++){
			System.out.println("Merge: "+output[i]);
		}
	}
}