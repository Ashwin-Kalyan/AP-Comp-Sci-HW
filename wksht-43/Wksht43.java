
/**
 * Solutions to Wksht 4.3
 *
 * @author Ashwin Kalyan
 * @version 2-29-24
 */
public class Wksht43
{
    public void print2dArray(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                System.out.println(arr[r][c] + "\t\t");
            }
            System.out.println();
        }
    }
    
    public int randomInt() {
        return (int)(Math.random() * 100) + 1;
    }
    
    public void main() {
        int[][] arr2 = new int[8][8];
        
        for (int r = 0; r < arr2.length; r++) {
            for (int c = 0; c < arr2[0].length; c++) {
                arr2[r][c] = randomInt();
            }
        }
        
        System.out.println("Original Array");
        print2dArray(arr2);
        
        for (int r = 0; r < arr2.length; r++) {
            for (int c = r + 1; c < arr2[r].length; c++) {
                int x = arr2[r][c];
                arr2[r][c] = arr2[c][r];
                arr2[c][r] = x;                
            }
        }
        
        System.out.println("Transposed Array");
        print2dArray(arr2);
    }
}
