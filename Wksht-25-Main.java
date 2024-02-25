import java.util.Scanner;

class Main {
  Scanner stdin = new Scanner(System.in);
  public static void main(String[] args) {
    // Q1
    Integer ehs = new Integer(83);
    Integer wildcat = new Integer(61);
    System.out.println(ehs + " " + wildcat);
    
    // Q2
    Scanner stdin = new Scanner(System.in);
    int k = stdin.nextInt();
    k = ehs;

    // Q3
    while (true) {
      k = stdin.nextInt();
      ehs = k;
      String korigianl = ehs.toString(); // Q4
      System.out.println(k + " " + ehs);

      if (k == 0) {
        break;
      }
    }

    
  }
}