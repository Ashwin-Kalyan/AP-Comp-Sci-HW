import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final double LOW_NORMAL = 18.5;
    final double HIGH_NORMAL = 24.9;
    final double HIGH_OVERWEIGHT = 29.9;
    
    double height;
    double weight;
    double gainThis;
    double loseThis;
    double roundGainThis;
    double roundLoseThis1;
    double roundLoseThis2;
    
    final double MIN_HEIGHT = 36.0; // 3 feet
    final double MAX_HEIGHT = 96.0; // 8 feet
    final double MIN_WEIGHT = 40.0; 
    final double MAX_WEIGHT = 600.0; 
    
    while (true) {
      Scanner stdin = new Scanner(System.in);
      
      System.out.print("Enter your height in inches (enter zero to exit) > ");
      height = stdin.nextDouble();
      
      if (height == 0) {
        return;
      } else if (height < MIN_HEIGHT || height > MAX_HEIGHT) {
        System.out.println("Please enter a height between 3 ft and 8 ft.\n ");
        continue;
      }
      
      System.out.print("Enter your weight in pounds (enter zero to exit) > ");
      weight = stdin.nextDouble();
      
      if (weight == 0) {
        return;
      } else if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
        System.out.println("Please enter a weight between 40 and 600 pounds.\n ");
        continue;
      }

      double bmi = weight / (height * height) * 703;
      double roundBMI = (int)(bmi * 10 + .5) / 10.0;
      System.out.println(" \nYour BMI is " + roundBMI);

      if (bmi < LOW_NORMAL) {
        System.out.println("You are underweight!\n ");

        gainThis = ((18.5 * (height * height)) / 703) - weight;
        roundGainThis = (int)(gainThis * 10 + .5) / 10.0; // to nearest tenth
        System.out.println("You need to gain " + roundGainThis + " lbs to be of normal weight.\n ");
      } else if (bmi <= HIGH_NORMAL) {
        System.out.println("You are of normal weight!\n ");
      } else if (bmi <= HIGH_OVERWEIGHT) {
        System.out.println("You are overweight!\n ");

        loseThis = weight - ((24.9 * (height * height) / 703));
        roundLoseThis1 = (int)(loseThis * 10 + .5) / 10.0; // to nearest tenth
        System.out.println("You need to lose " + roundLoseThis1 + " lbs to be of normal weight.\n ");
      } else {
        System.out.println("You are obese!\n ");

        loseThis = weight - ((24.9 * (height * height) / 703));
        roundLoseThis2 = (int)(loseThis * 10 + .5) / 10.0; // to nearest tenth
        System.out.println("You need to lose " + roundLoseThis2 + " lbs to be of normal weight.\n ");
      }
    } 
  } 
}