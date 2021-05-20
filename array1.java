/*Sum array elements greater than a value
Write a program that reads an array of ints and an integer number n. The program must sum all the array elements greater than n.

Input data format

The first line contains the size of an array.
The second line contains the elements of the array separated by spaces.
The third line contains the number n.

Output data format

Only a single number representing the sum.


Sample Input:
5
5 8 11 2 10
8

Sample Output:
21
*/
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        int temp=0;
        int len = sc.nextInt();
        int[] arr = new int[len];
        for( i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        for(i=0; i<len; i++) {
            if (arr[i] > n) {
                temp = temp + arr[i];
            }
        }
        System.out.println(temp);

    }
}
  
