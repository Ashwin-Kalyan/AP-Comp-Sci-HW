import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    // Q1
    System.out.print("Enter your first number > ");
    int num = stdin.nextInt();
    System.out.print("Enter your second number > ");
    int num2 = stdin.nextInt();

    if (num2 < num) {
      if (num2 % 2 != 0) {
        System.out.print(num2 + " ");
      } 
      for (int i = num2; i <= num; i++) {
        if (i % 2 == 0) {
          System.out.print(i + " ");
        } 
      }
      if (num % 2 != 0) {
        System.out.print(" " + num);
      }
    } else {
      if (num % 2 != 0) {
        System.out.print(num + " ");
      } 
      for (int i = num; i <= num2; i++) {
        if (i % 2 == 0) {
          System.out.print(i + " ");
        } 
      }
      if (num2 % 2 != 0) {
        System.out.print(" " + num2);
      }
    }
    System.out.println();
    // Q2
    for (int i = 10; i >= 1; i--) {
      for (int j = i; j <= (2 * i - 1); j++) {
        System.out.print("X");
      }
      System.out.println();
    }
    // Q3
    int rows = 10;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < rows - i; k++) {
        System.out.print("X");
      }
      System.out.println();
    }
    // Q4
    System.out.print("Enter another number > ");
    int numb = stdin.nextInt();
    int ans = 1;
    for (int i = 1; i <= numb; i++) {
      ans *= i;
    }
    System.out.println(ans);
    // Q5
    while (true) {
      System.out.print("Enter another number > ");
      int numb2 = stdin.nextInt();
      if (numb2 == 0 || num2 < 0) {
        break;
      }
      int ans2 = 1;
      for (int i = 1; i <= numb2; i++) {
        ans2 *= i;
      }
      System.out.println(ans2);
    }
    // Q6
    // I can find accurate values until 12, after 12 it gives inaccurate answers. For example if I were to put in 13 it would give us 1,932,053,504 even though the answer is actually 6,227,020,800. This is because the data type int is a 32-bit integer and 6,227,020,800 exceeds the max value a 32-bit int can store (2,147,483,647). So Java gives an inaccurate answer to circumvent this overflow. A simple fix would be using long instead of int or using the reference type BigInteger. 
    // BONUS
    for (int i = 9; i >= 1; i -= 2) {
      int remainder = (9 - i) / 2;
      for (int r = 0; r < remainder; r++) {
        System.out.print(" ");
      }
      for (int x = 0; x < i; x++) {
        System.out.print("X");
      }
      for (int r = 0; r < remainder; r++) {
        System.out.print(" ");
      }
      System.out.println();
    }
    for (int i = 3; i <= 9; i += 2) {
      int remainder = (9 - i) / 2;
      for (int r = 0; r < remainder; r++) {
        System.out.print(" ");
      }
      for (int x = 0; x < i; x++) {
        System.out.print("X");
      }
      for (int r = 0; r < remainder; r++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}