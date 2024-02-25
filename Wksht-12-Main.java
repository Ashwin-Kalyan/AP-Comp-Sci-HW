class Main 
{
  public static void main(String[] args) 
	{
    int score = 35;
    int year = 2012;
    int february = 29;
    boolean leap_year = true;
    double pi = 3.14159;
    char grade = 'A';
    double bat = 13.95;
    double ball = 5.99;
    double glove = 109.52;

    // Question 1
    System.out.println("The value of \"score\" is " + score);

    // Question 2
    System.out.print("line one\nline two\nline three\nline four\n");

    // Question 3A
    System.out.println("bat    " + bat);
    System.out.println("ball   " + ball);
    System.out.println("glove  " + glove);

    // Question 3B
    System.out.println("bat\t\t" + bat);
    System.out.println("ball\t" + ball);
    System.out.println("glove\t" + glove);

    // Question 4
    System.out.println("The int \"year\" has a value of " + year);
    System.out.println("The int \"february\" has a value of " + february);
    System.out.println("The boolean \"leap_year\" has a value of " + leap_year);
    System.out.println("The double \"pi\" has a value of " + pi);
    System.out.println("The char \"grade\" has a value of " + grade);

    // Question 5
    System.out.print("The statement \"" + year + " is a leap year\"" + " is " + leap_year + ", February had " + february + " days.");
  }
}