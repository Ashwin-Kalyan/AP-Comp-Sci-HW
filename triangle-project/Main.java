
/**
 * Declares the colors and triangles. Compares every triangle in the triangles array and prints a result when the triangles match when both are not rotated, when the second triangle is rotated to the left, or when the second triangle is rotated to the right.
 *
 * @author Ashwin Kalyan
 * @version 2/1/24
 */
public class Main
{
    public void main() {
        final int BLUE = 1;
        final int YELLOW = 2;
        final int GREEN = 3;
        final int PINK = 4;
        
        Triangle[] triangles = new Triangle[22];
        triangles[1] = new Triangle(BLUE, YELLOW, GREEN);
        triangles[2] = new Triangle(PINK, BLUE, YELLOW);
        triangles[3] = new Triangle(GREEN, PINK, YELLOW);
        triangles[4] = new Triangle(YELLOW, BLUE, GREEN);
        triangles[5] = new Triangle(BLUE, GREEN, PINK);
        triangles[6] = new Triangle(GREEN, BLUE, PINK);
        triangles[7] = new Triangle(YELLOW, BLUE, PINK);
        triangles[8] = new Triangle(GREEN, BLUE, YELLOW);
        triangles[9] = new Triangle(PINK, BLUE, GREEN);
        triangles[10] = new Triangle(BLUE, PINK, YELLOW);
        triangles[11] = new Triangle(YELLOW, PINK, GREEN);
        triangles[12] = new Triangle(PINK, GREEN, BLUE);
        triangles[13] = new Triangle(GREEN, PINK, YELLOW);
        triangles[14] = new Triangle(YELLOW, GREEN, PINK);
        triangles[15] = new Triangle(GREEN, PINK, BLUE);
        triangles[16] = new Triangle(BLUE, PINK, GREEN);
        triangles[17] = new Triangle(PINK, YELLOW, BLUE);
        triangles[18] = new Triangle(YELLOW, PINK, BLUE);
        triangles[19] = new Triangle(GREEN, YELLOW, BLUE);
        triangles[20] = new Triangle(BLUE, GREEN, YELLOW);
        triangles[21] = new Triangle(YELLOW, GREEN, BLUE);
        
        // loops through each triangle
        for (int i = 1; i < triangles.length; i++) {
            // compares triangle from first for loop with every other triangle
            for (int j = i + 1; j < triangles.length; j++) {
                if (triangles[i].compareColors(triangles[j])) {
                    System.out.println("Triangle " + i + " and triangle " + j + " are the same when triangle " + j + " is not rotated.");
                } else if (triangles[i].compareColorsRight(triangles[j])) {
                    System.out.println("Triangle " + i + " and triangle " + j + " are the same when triangle " + j + " is rotated to the right.");
                } else if (triangles[i].compareColorsLeft(triangles[j])) {
                    System.out.println("Triangle " + i + " and triangle " + j + " are the same when triangle " + j + " is rotated to the left.");
                }
            }
        }
    }
}
