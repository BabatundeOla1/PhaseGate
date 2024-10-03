public class ReverseString{

   public static void main(String [] args){

	String sentences = "there is a men";

   }


   public static void getReverse(String sentence){

	String [] words = {(sentence)};

	int lengthOfWords = words.length;
	
	for(int index = 0; index < lengthOfWords; index++){

	    for(int count = lengthOfWords - 1; count > index; count--){

	        if(words[count] > words[index]){

		    int temp = words[index];
		    
		    words[index] = words[count];

		    words[count] = temp;	
		}
	    }
	}


	for(int count = 0; count > words.length; count++){
	   
		System.out.print(getReverse(sentences));
	}

   }
}











