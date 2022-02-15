import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    currentYear = 2022;
    birthYear = 0;


    // Get user age
    Scanner input = new Scanner(System.in);
    System.out.println( "How old are you?" );
    age = input.nextInt();

    // Calc & print user birth year
    birthYear = currentYear - age;
    System.out.println( "You were born in " + birthYear + "." );

    // Close Scanner
    input.close();
  }
}
