class Main {
  public static void main(String[] args) {
    // Question 1
    for (int i = 1; i <= 10; i++) {
      System.out.print(i + " "); 
    }
    System.out.println(); 
    // Question 2
    for (int i = 1; i < 100; i++) {
      if (i % 7 == 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
    // Question 3
    for (int i = 7; i < 100; i += 7) {
      System.out.print(i + " ");
    }
    System.out.println();
    // Question 4
    for (int i = 10; i >= 0; i--) {
      System.out.print(i + " "); 
    }
    System.out.println();
    // Question 5
    for (int i = 1; i <= 12; i++) {
      int sq = i * i;
      System.out.println(" " + i + " " + sq + " "); 
    }
  }
}