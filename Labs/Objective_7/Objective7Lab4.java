public class Objective7Lab4 {
  public static void main(String[] args) {
    int count = 0, sum = 0;

    while(count <= 20) {
      sum += count;
      System.out.println( "Count: " + count + " | " + "Sum: " + sum );
      count += 1;
    }
  }
}
