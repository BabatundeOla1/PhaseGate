public class ReverseString{

   public static void main(String [] args){

	String sentences = "there is a men";

	getReverse(sentences);
	

   }


   public static void getReverse(String sentence){

	String [] words = {(sentence)};

	int lengthOfWords = words.length;

	    for(int count = lengthOfWords - 1; count > 0; count--){

	      	System.out.print(words[count] + " ");
	    }
   }
}











