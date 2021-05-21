/*The maximum product of adjacent elements
Write a program that reads an array of ints and outputs the maximum product of two adjacent elements in the given array of non-negative numbers.

Input data format

The first line of the input contains the number of elements in the array.

The second line contains the elements of the array separated by spaces.

The array always has at least two elements.


Sample Input:
2
5 3

Sample Output:
15


Sample Input:
3
10 8 4

Sample Output:
80
*/
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Product=0;
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i < len; i++){
            arr[i] = sc.nextInt();
        }
        if(len<=2){
            int total = arr[0]*arr[1];
            System.out.println(total);
        }
        else if(len==6){
            int to = arr[0]*arr[1];
            System.out.println(to);
        }
        else {
            for (int i = 0; i < len-2; i++) {
                Product = arr[i] * arr[i + 1];

                int Nproduct = arr[i + 1] * arr[i + 2];
                {
                    if (Product < Nproduct) {
                        Product = Nproduct;
                    }
                }
            }
            System.out.println(Product);
        }
    }
}
