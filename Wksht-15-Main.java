import java.util.Scanner;
class Main {
public static void main(String[] args){
    Scanner stdin = new Scanner(System.in);

    // Question 1
    System.out.print("Enter a temperature in Farenheit as an integer > ");
    int intF = stdin.nextInt();
    int returnIntC = (intF - 32) * 5 / 9;
    System.out.println(intF + " F° in Celsius is " + returnIntC + " C°");

    // Question 2
    System.out.print("Enter a temperature in Celsuis as an integer > ");
    int intC = stdin.nextInt();
    int returnIntF = intC * 9 / 5 + 32;
    System.out.println(intC + " C° in Farenheit is " + returnIntF + " F°");

    // Question 3
    System.out.print("Enter a temperature in Farenheit as a double > ");
    double doubleF = stdin.nextDouble();
    double returnDoubleC = (doubleF - 32) * 5.0 / 9.0;
    System.out.println(doubleF + " F° in Celsius is " + returnDoubleC + " C°");

    // Question 4
    System.out.print("Enter a temperature in Celsius as a double > ");
    double doubleC = stdin.nextDouble();
    double returnDoubleF = doubleC * 5.0 / 9.0 + 32;
    System.out.println(doubleC + " C° in Farenheit is " + returnDoubleF + " F°");

    // Question 5 - it converts the boolean to an integer
  }
}