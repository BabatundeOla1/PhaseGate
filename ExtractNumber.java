public class ExtractNumber{

   public static void main(String [] args){

	String input = "123345Babatuhd1423565kjaretnde";
	extractDigit(input);
		
   }


   public static void extractDigit(String words){

   	for(int count = 0; count < words.length(); count++){

		char letter = words.charAt(count);

		if(Character.isDigit(letter))

			System.out.print(letter + ",");

	}

   }

}