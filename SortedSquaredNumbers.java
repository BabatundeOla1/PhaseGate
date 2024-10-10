import java.util.Arrays;

public class SortedSquaredNumbers{

   public static void main(String [] args){

	int [] numbers = {2, 1, 4, 3, 5, 9};

	System.out.println("Original Number: " + Arrays.toString(numbers));

	System.out.println("Square Numbers: " + Arrays.toString(getSquare(numbers)));

	System.out.print("Sorted Square Numbers: " + Arrays.toString(getsortNumbers(getSquare(numbers))));

   }

   public static int[] getSquare(int [] elements){

	int[] square = new int[elements.length];

	for(int count = 0; count < elements.length; count++){
		square[count] = elements[count] * elements[count];

	}

		return square;
   }

   public static int [] getsortNumbers(int [] array){

	for(int index = 0; index < array.length; index++){
		
		for(int counter = 1; counter < array.length; counter++){

 			if(array[counter - 1] > array[counter]){

				int temp =  array[counter - 1];

				array[counter - 1] = array[counter];

				array[counter] = temp;
			}
		}
	}

	return array;
	
   }


}