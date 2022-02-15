import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    String fname = "";
    String lname = "";
    String favoriteAnimal = "";
    String favoriteFood = "";
    String favoriteSong = "";


    // Get user input
    System.out.println( "Hello! What is your first name?" );
    fname = keyboard.nextLine();

    System.out.println( "What's your last name?" );
    lname = keyboard.nextLine();

    System.out.println( "What's your favorite animal, " + fname + "?" );
    favoriteAnimal = keyboard.nextLine();

    System.out.println( "What's your favorite food?" );
    favoriteFood = keyboard.nextLine();

    System.out.println( "What's your favorite song?" );
    favoriteSong = keyboard.nextLine();

    // Print user input
    System.out.println( "My name is " + fname + " " + lname + ".");
    System.out.println( "My favorite animal is the " + favoriteAnimal + "." );
    System.out.println( "My favorite food is " + favoriteFood + ".");
    System.out.println( "My favorite song is " + favoriteSong + ".");

    // Close Scanner
    keyboard.close();
  }
}
