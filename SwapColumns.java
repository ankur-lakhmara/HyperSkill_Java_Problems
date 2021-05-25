/*Swap the columns
Given a two-dimensional array (matrix) and the two numbers: i and j. Swap the columns with indexes i and j within the matrix.

Input contains matrix dimensions n and m, not exceeding 100, then the elements of the matrix, then the indexes i and j.


Sample Input:
3 4
11 12 13 14
21 22 23 24
31 32 33 34
0 1

Sample Output:
12 11 13 14
22 21 23 24
32 31 33 34

*/
import javax.sound.sampled.Line;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int[][] matrix = new int[i][j];
        for (int y = 0; y < i; y++) {
            for (int x = 0; x < j; x++) {
                matrix[y][x] = scanner.nextInt();
            }
        }
        int swap1 = scanner.nextInt();
        int swap2 = scanner.nextInt();
        for (int[] arr : matrix) {
            int temp = arr[swap1];
            arr[swap1] = arr[swap2];
            arr[swap2] = temp;
            for (int el : arr) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}
