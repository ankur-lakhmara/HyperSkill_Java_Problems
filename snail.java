/*Snail creeps up the vertical pole of height H feet. It goes A feet up per day, and B feet down per night. In which day will the snail reach the top of the pole?

Input data format

On the input the program receives non-negative integers H, A, B, where H > B and A > B. Every integer does not exceed 100.

 Report a typo
Sample Input 1:

10
3
2
Sample Output 1:

8
Sample Input 2:

20
7
3
Sample Output 2:

5*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int day = (H-B-1)/(A-B)+1;
        System.out.println(day);
    }
}
