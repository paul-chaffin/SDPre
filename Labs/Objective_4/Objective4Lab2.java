import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 0, num2 = 0, num3 = 0, intsSum;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0, dubsSum;

    // Get integers from user
    System.out.println( "Please supply three integers.\n1st integer: " );
    num1 = keyboard.nextInt();

    System.out.println( "2nd integer: " );
    num2 = keyboard.nextInt();

    System.out.println( "3rd integer: " );
    num3 = keyboard.nextInt();

    // Get doubles from user
    System.out.println( "Please supply three non-integers.\n1st non-integer: " );
    dub1 = keyboard.nextDouble();

    System.out.println( "2nd non-integer: " );
    dub2 = keyboard.nextDouble();

    System.out.println( "3rd non-integer: " );
    dub3 = keyboard.nextDouble();

    // Calc & print integers sum
    intsSum = num1 + num2 + num3;
    System.out.println( "The sum of the integers is " + intsSum + "." );

    // Calc & print doubles sum
    dubsSum = dub1 + dub2 + dub3;
    System.out.println( "The sum of the non-integers is " + dubsSum + "." );

    // Close Scanner
    keyboard.close();
  }
}
