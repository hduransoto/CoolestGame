import java.lang.Math;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Hangman{
    public static void main(String[] arg) {
	
	String[] states = {"California", "Alabama", "Arkansas", "Arizona", "Alaska", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};
	
	
	int random = (int)(Math.random()*states.length);
	String wordToGuess = states[random];
	
	
	System.out.print("The word is: " );
	for (int i=0; i < wordToGuess.length(); i++){
	    System.out.print("*");
	}
	System.out.println();
	
	String firstGuess = "";
	
	try{
	    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("guess a state:");
	    firstGuess = bufferRead.readLine();
	}catch(IOException e){
	    e.printStackTrace();
	}
	
	System.out.println("your guess is: " + firstGuess);
	
	
	int numOfTries = 1;
	boolean end = false;
	while(end == false){

	    
	    if (compare( firstGuess, wordToGuess)){
		System.out.println("YOU WIN!! ERES CHINGON!!");
		end = true;
		break;
	    }

	    if(numOfTries==3){
		System.out.println("Perdiste Imbecil the word was: "+ wordToGuess);
		end = true;
		break;
	    }
	    
	    else{
		end = false;
			
		firstGuess = "";
			numOfTries++;

		try{
		    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("keep trying (eres un pendejo) & tries:" + numOfTries);
		    firstGuess = bufferRead.readLine();
		}catch(IOException e){
		    e.printStackTrace();
		}
		
	    }

	}
    }
    
    
    public static boolean compare(String g, String w){
	return g.equals(w);
    }
}
