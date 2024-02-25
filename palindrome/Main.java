import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Q1.");
        System.out.print("Enter a phrase: ");
        Scanner stdin = new Scanner(System.in);
        String line = stdin.nextLine();
        System.out.println("You entered: " + line + ". This is " + line.length() + " characters long.\n ");

        System.out.println("Q2.");
        while(true) {
            line = "";
            System.out.print("Enter a phrase: ");
            line = stdin.nextLine();

            if (line.length() == 0) {
                System.out.println();
                break;
            } else {
                System.out.println("You entered: " + line + ". This is " + line.length() + " characters long.\n ");  
            }
        }

        System.out.println("Q3.");
        while(true) {
            String reverse = "";
            System.out.print("Enter a phrase: ");
            line = stdin.nextLine();

            if (line.length() == 0) {
                System.out.println();
                break;
            } else {
                System.out.println("You entered: " + line + ". This is " + line.length() + " characters long.");

                for (int i = line.length() - 1; i >= 0; i--) {
                    reverse += line.substring(i,i + 1);
                }
                if (reverse.equals(line)) {
                    System.out.println("This is a palindrome!\n ");
                } else {
                    System.out.println("This is not a palindrome!\n ");
                } 
            }
        }

        System.out.println("Q4.");
        while(true) {
            String reverse = "";
            System.out.print("Enter a phrase: ");
            line = stdin.nextLine();

            line = line.toLowerCase();
            if (line.length() == 0) {
                System.out.println();
                break;
            } else {
                System.out.println("You entered: " + line + ". This is " + line.length() + " characters long.");
                for (int i = line.length() - 1; i >= 0; i--) {
                    reverse += line.substring(i,i + 1);
                }
                if (reverse.equals(line)) {
                    System.out.println("This is a palindrome!\n ");
                } else {
                    System.out.println("This is not a palindrome!\n ");
                } 
            }
        }

        System.out.println("Q5.");
        while(true) {
            char ch;
            String reverse = "";
            String line2 = "";
            System.out.print("Enter a phrase: ");
            line = stdin.nextLine();

            line = line.toLowerCase();
            if (line.length() == 0) {
                System.out.println();
                break;
            } else {
                System.out.println("You entered: " + line + ". This is " + line.length() + " characters long.");
                for (int i = 0; i < line.length(); i++) {
                    ch = line.charAt(i);
                    if (ch >= 'a' && ch <= 'z') {
                        line2 += ch;
                    }
                }
                for (int i = line2.length() - 1; i >= 0; i--) {
                    reverse += line2.substring(i, i + 1);
                }

                if (reverse.equals(line2)) {
                    System.out.println("This is a palindrome!\n ");
                } else {
                    System.out.println("This is not a palindrome!\n ");
                } 
            }
        }
    }
}