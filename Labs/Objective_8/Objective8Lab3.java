public class Objective8Lab3 {
  public static void main(String[] args) {
    int isEven;

    for(int i = 1; i <= 20; i += 1) {
      isEven = i % 2;
      if(isEven == 0) {
        System.out.println( i + " is even");
      } else {
        System.out.println( i + " is odd");
      }
    }
  }
}
