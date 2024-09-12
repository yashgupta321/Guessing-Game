import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int x = rand.nextInt(100);
        int guess;
       
        System.out.println("Guess:");
        guess = scan.nextInt();
        int count=0; //count number of times user guesses
        while(guess!=x) {
            //if x is less than greater than or equal to
            
            if (guess < x) {
               
                count = count + 1;
                System.out.println(count + " " + "guess");
                System.out.println("Too Low!!");
            }         
            if (guess > x) {
               
                count = count + 1;
                System.out.println(count + " " + "guess");
                System.out.println("Too High!!");
            
            }
            guess = scan.nextInt();
            
           
       
    }
        if (guess == x) {
            count = count + 1;
            System.out.println("You got it!");

        if (count <= 7 && guess == x) {
            System.out.println("You got an impossibly good score!");
        }
        if (count > 7 &&  count <= 10 && guess == x) {
            System.out.println("You did a good job!");
        }
        if (count > 10 && guess == x) {
            System.out.println("Try the divide and conquer strategy next time!");
        }
        }

            }
        }
      