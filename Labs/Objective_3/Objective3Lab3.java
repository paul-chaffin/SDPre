public class Objective3Lab3 {
  public static void main(String[] args) {
    int first, second, third, sum;
    // Roll die
    first = 1 + (int)(Math.random() * 6);
    second = 1 + (int)(Math.random() * 6);
    third = 1 + (int)(Math.random() * 6);
    // Get sum
    sum = first + second + third;
    // Print result
    System.out.println(first + " + " + second + " + " + third + " = " + sum);
  }
}
