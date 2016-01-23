package arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		we can only store same type of data type in array
		int myintarray[] = {1,2,3,4,5};will work as well
		int[] myintarray = new int[5]
		*/
		
		int[] myintarray = {10,20,30,40,50};
		
		/*int index=0;
		while (index<5){
			System.out.println(myintarray[index]);
			index++;
		}*/
		
		for (int indec=0; indec<5; indec++){
			System.out.println(myintarray[indec]);
		}
		
		for (int element: myintarray){
			System.out.println(element);
		}
		
		
	}

}
