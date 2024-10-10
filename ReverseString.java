public class ReverseString{

   public static void main(String [] args){

     String [] sentences = {"there", "is", "a", "tide", "in", "the", "affairs", "of", "men"};
	
	getReverse(sentences);

   }


   public static void getReverse(String [] words){

	for(int count = words.length - 1; count >= 0; count--){

	     System.out.print(words[count] + " ");
	}
   }
}











