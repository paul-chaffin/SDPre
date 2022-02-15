public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 0;

    while(counter <= 20) {
      String modality;
      if(counter % 2 == 0) {
        modality = "even";
      } else {
        modality = "odd";
      }
      System.out.println( counter + " is " + modality + "." );
      counter += 1;
    }
  }
}
