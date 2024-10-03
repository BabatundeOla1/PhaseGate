import java.util.Arrays;

public class SortedSquareNumbers{

   public static void main(String [] args){

	int [] numbers = {2, 1, 4, 3, 5, 9};

	int [] squareNum = getSquare(numbers);
	Arrays.sort(squareNum);


	System.out.println("Original Numbers: " + Arrays.toString(numbers));
	System.out.print("Sorted Squared: " + Arrays.toString(squareNum));
	
   }


   public static int[] getSquare(int [] elements){

	int[] square = new int[elements.length];

	for(int count = 0; count < elements.length; count++){
		square[count] = elements[count] * elements[count];

	}
		return square;

   }



}