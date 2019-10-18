import java.util.Scanner;
import java.lang.Math;
public class Guessing_Game{
    public static void main (String [] args){
         
        int number =(int)(Math.random()*20)+1;
         
        System.out.println("Guess an integer between 1 and 20");
        
        Scanner scan = new Scanner (System.in);
        int guess = scan.nextInt();
         if(guess<number){
            System.out.println("Higher");
        }
        if(guess > number){
            System.out.println("Lower");
        } 
        if(guess == number){
            System.out.println("Correct!");
        } 
       while (guess != number){
          int secondguess = scan.nextInt();
          if(secondguess<number){
            System.out.println("Higher");
        }
        if(secondguess > number){
            System.out.println("Lower");
        } 
        if(secondguess == number){
            System.out.println("Correct!");
            System.exit(0);
        }
    }
}
}
