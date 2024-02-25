import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   // Q1
    for (int i = 0; i <= 9; i++) {
      System.out.println(Math.random());
    }

    // 2. Create another loop which prints 10 random whole floating point numbers between between 0 and 100. Use the round() method from the Math class to help.
    int max = 100;
    int min = 0;
    int range = max - min + 1;
    
    for (int i = 0; i <= 9; i++) {
      System.out.println(Math.round(Math.random() * range + min));
    }
    // 3. Prompt and use the Scanner class method next() to read a String from standard input (e.g. Scanner stdin = new Scanner(System.in)). Print the string input.
    Scanner stdin = new Scanner(System.in);
    System.out.print("Enter string > ");
    String strInput =  stdin.next();
    System.out.println(strInput);

    /* 4. Use the method compareTo() of the String class to prompt for and test a string input to see if the word “goodbye”
is input. If “goodbye” is input, print the message: “You say goodbye and I say hello!”. If you did not type “goodbye”,
print the message: “Hello, hello!”.
*/
    System.out.print("Enter another string > ");
    String strInput2 =  stdin.next();
    if (strInput2.compareTo("goodbye") == 0) {
      System.out.println("You say goodbye and I say hello!");
    } else {
      System.out.println("Hello, hello!");
    }

    /* 5. Use the above methodologies to create an infinite loop which will print random whole numbers between 0 & 1000
inclusive and prompt you to continue - each time you enter “yes”, another random number will be output - anything
else will cause the program to exit.*/

    while (true) {
      System.out.print("Would you like to proceed (yes or no) > ");
      String strInput3 =  stdin.next();
      if (strInput3.compareTo("yes") == 0) {
        System.out.println(Math.round(Math.random() * 1000));
      } else {
        break;
      }
    }
  }
}