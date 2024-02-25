import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int abs; 
    int number_negative = 0;
    int number_positive = 0;
    Scanner stdin = new Scanner(System.in);
    
    while(true) {
      System.out.print("Enter an integer > ");
      int num = stdin.nextInt();
      
      if (num == 0) {
        break;
      } else if (num < 0) {
        abs = num * -1;
        number_negative++;
      } else {
        abs = (num + 5) / 10 * 10;
        number_positive++; 
      }
  
      System.out.println("The absolute value of " + num + " is " + abs + "\n");
    }
    System.out.println("\nNumber of negative inputs: " + number_negative + "\nNumber of positive inputs: " + number_positive + "\n ");
  }
}