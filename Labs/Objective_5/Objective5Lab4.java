import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    int userNum;
    Scanner keyboard = new Scanner(System.in);

    // Get user input
    System.out.println( "Please enter a number: " );
    userNum = keyboard.nextInt();

    // Evaluate user input & print result
    if((userNum % 2) != 0) {
      System.out.println( "The number is odd." );
    }
    else {
      System.out.println( "The number is even." );
    }
  }
}
