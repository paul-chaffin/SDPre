public class SwitchTest {
  public static void main(String[] args) {
    char grade;
    grade = 'A';

    switch (grade) {
      case 'A':
        System.out.println("Great");

      case 'B':
        System.out.println("Okay");
        
      default:
        System.out.println("Bad");
    }
  }
}
