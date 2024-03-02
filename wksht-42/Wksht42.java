
/**
 * Solutions to AP Computer Science Wksht 4.2
 *
 * @author Ashwin Kalyan
 * @version 2-29-24
 */
public class Wksht42
{
    public void main() {
        int[][] matrix1 = new int[3][4];
        int[][] matrix2 = new int[3][4];
        
        System.out.println("Matrix 1 is");
        for (int r = 0; r < matrix1.length; r++) {
            for (int c = 0; c < matrix1[0].length; c++) {
                matrix1[r][c] = randomInt();
                System.out.print(matrix1[r][c] + "\t\t");
            }
            System.out.println();
        }
        System.out.println("Matrix 2 is");
        for (int r = 0; r < matrix2.length; r++) {
            for (int c = 0; c < matrix2[0].length; c++) {
                matrix2[r][c] = randomInt();
                System.out.print(matrix1[r][c] + "\t\t");
            }
            System.out.println();
        }
        
        int[][] results = new int[3][4];
        
        System.out.println("The result when the two matrices are added together");
        for (int r = 0; r < results.length; r++) {
            for (int c = 0; c < results[0].length; c++) {
                results[r][c] = matrix1[r][c] + matrix2[r][c];
                System.out.println(results[r][c] + "\t\t");
            }
            System.out.println();
        }
        
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        
        int[] sumOfRows = new int[rows];
        int sum = 0;
            
        for (int i = 0; i < rows; i++) {
            for (int j = 0; i < columns; i++) {
                sum += results[i][j];
            }
            sumOfRows[i] = sum;
        }
        
        int maxSum = sumOfRows[0];
        int maxIndex = 0;
        
        for (int i = 0; i < columns; i++) {
            if (sumOfRows[i] > maxSum) {
                maxSum = sumOfRows[i];
                maxIndex = i;
            }
        }
        
        System.out.println("The row in the results matrix with the greatest sum is row " + (maxIndex + 1) + ", with a sum of " + maxSum);
    }

    public int randomInt()
    {
        return (int) (Math.random() * 9);
    }
}
