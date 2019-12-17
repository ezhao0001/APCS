import java.util.Random;
import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

  public class Final_Program{
    
    public static void main(String [] args){
     
     // initialize variables for game
     Scanner scan = new Scanner(System.in);
     int guesses =0;
     int incorrectGuesses = 0;
     String currentLetter ="";
     String blankWord = "";
     String guessedLetters= "";
     boolean correctGuess = false;
      
     // create a temporary word with the current state of guesses.  It starts with nothing found. ( _ _ _ _ _ _ _ )
    
       String word = getRandomWord();
       int a = word.length();
       System.out.println("The word has " + a + " letters.");
       
     for (int j = 0; j < word.length(); j++){
          blankWord += "_";
       }
       
     // guess letters in word
     while (guesses != word.length()) { 
       System.out.println("Enter a letter: ");
      
        displayStatusOfWord(blankWord);    
     
       String guessedLetter = scan.nextLine();
       guessedLetter = guessedLetter.toLowerCase();
         
       // check guessedLetters string for the guessed letter.  If it has already been guessed, display "You guessed that!".  Otherwise, continue and add the
       // the letter to the guessedLetters string
       if (guessedLetters.indexOf(guessedLetter) == -1) {
        // the letter has not been guessed 
          guessedLetters += guessedLetter;
         System.out.println();
       } else {
         System.out.println("You have already guessed that!");
       }
     
       for (int k = 0; k <word.length(); k++){
           
         currentLetter = word.substring(k, k+1);  //prints letters between index of i and i-1, substring (18) deletes first 18 indexes and keeps only the remainder
       
         // if a match, increment for each instance of the letter and change blankWord so it shows letters in word
         if (currentLetter.equals(guessedLetter)){
           blankWord = blankWord.substring(0, k) + guessedLetter + blankWord.substring(k+1);
           guesses++;
           correctGuess = true;
         } 
           
           
       } // end for loop
         
       
        if (correctGuess) {
           System.out.println("You got a letter");
         } else {
            incorrectGuesses++;
           System.out.println("Sorry, that letter is not in the word"); 
         }
             correctGuess = false;
             displayHangman(incorrectGuesses);
         } 
     if (guesses == word.length()){
       displayStatusOfWord(blankWord);
       System.out.println("\nYou Win!");
    }
     } // end while loop
  
    
    
    public static void displayStatusOfWord(String blankWord) {
      for (int i = 0; i < blankWord.length(); i++){
         System.out.print(blankWord.substring(i,i+1) + " ");
       }   
    }

    public static void displayGuessedLetters(String gl) {
      
    }
    
    public static String getRandomWord() {
      //Generate a random word
    
     String [] mywords = {"pineapple", "America","fall","computer","today"};
     Random rand = new Random();
     int x = rand.nextInt(5);     
     String word = mywords[x]; 
     return word;

    }
    public static void displayHangman(int incorrectGuesses){
       // display hangman
     
         if (incorrectGuesses > 1){
           System.out.println("\n");
         }
         if (incorrectGuesses > 2){
           System.out.println("----|");
         }
         if (incorrectGuesses > 3){
           System.out.println("|    o");
         }
         if (incorrectGuesses > 4){
           System.out.println("|   /|\\");  
         }
  }
}
  
  
  
  
  
  

