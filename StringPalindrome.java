public class StringPalindrome{

   public static void main(String [] args){

	String sentence = "there is a men";

	
	for(int count = 0; count > sentence.length; count++){
	   
		System.out.print(getReverse(sentence));
	}

   }


   public static String[] getReverse(String sen){

	String [] words = {[sen]};

	String [] lengthOfWords = new String[words.length];

	//String start = words[0];

	//String end = lengthOfWords - 1;
	
	for(int index = 0; index < lengthOfWords; index++){

	    for(int count = lengthOfWords - 1; count > index; count--){

	        if(words[count] > words[index]){
		    int temp = words[index];
		    
		    words[index] = words[count];

		    words[count] = temp;	
		}
	    }
	}

   }
}











