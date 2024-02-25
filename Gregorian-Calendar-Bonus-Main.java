import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    while (true) {
      System.out.print("Enter a year to check if it is a leap year > ");
      Scanner stdin = new Scanner(System.in);
      int year = stdin.nextInt();
  
      if (year == 0) {
        break;
      } else if (year < 1582) {
        System.out.println("Please enter a year after 1582.\n ");
        continue;
      } else {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
          System.out.println(year + " is a leap year!\n ");  
        } else {
          System.out.println(year + " is not a leap year.\n ");
        }
      }
    }
  }
}