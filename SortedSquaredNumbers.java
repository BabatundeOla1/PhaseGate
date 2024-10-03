import java.util.Arrays;

public class SortedSquaredNumbers{

   public static void main(String [] args){

	int [] numbers = {2, 1, 4, 3, 5, 9};

	int [] squareNum = getSquare(numbers);
	


	getsortNumbers(squareNum);

	System.out.println(Arrays.toString(squareNum));

   }


   public static int[] getSquare(int [] elements){

	int[] square = new int[elements.length];

	for(int count = 0; count < elements.length; count++){
		square[count] = elements[count] * elements[count];

	}
		return square;

   }


   public static void getsortNumbers(int [] array){

	int lengthOfArray = array.length;

	for(int index = 0; index < lengthOfArray; index++){
		
		for(int counter = 1; counter < lengthOfArray; counter++){

 			if(array[counter - 1] > array[counter]){

				int temp =  array[counter - 1];

				array[counter - 1] = array[counter];

				array[counter] = temp;
			}
		}
	}
	
   }


}