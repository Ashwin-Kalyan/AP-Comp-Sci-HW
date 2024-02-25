import java.util.Scanner;

class Main {
  public static int rollDie() {
    int value = (int)(Math.random() * 6) + 1;
    return value;
  }
  
  public static void main(String[] args) {
    while (true) {
      System.out.print("Enter how may times you dies you want to roll (enter 0 to quit) > ");
      Scanner stdin = new Scanner(System.in);
      int value = stdin.nextInt();
      if (value == 0 || value < 0) {
        break;
      }
      for (int i = 0; i < value; i++) {
        System.out.println(rollDie());
      }
    }
  }
}