/*Find the number of D, C, B and A grades for the last test on informatics, where n students from a class have successfully passed the test.

In this task, we use a 5-point grading system and are interested only in passing grades: from 2 to 5. They correspond to the letter grades in the following way: 5 is for A, 4 is for B, 3 is for C and 2 is for D. The program gets number n as input and then gets the grades themselves: one by one.

The program should output four numbers in a single line: the number of D, C, B, and A grades respectively.

Sample Input 1:

13
2
5
5
5
5
3
2
4
3
3
3
2
3
Sample Output 1:

3 5 1 4

*/


import java.util.Scanner;

class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int store;
        for(int i=0; i<range; i++) {
            store = sc.nextInt();
            if(store == 5) {
                A += 1;
            }
            if(store == 4) {
                B += 1;
            }
            if(store == 3){
                C += 1;
            }
            if(store == 2) {
                D += 1;
            }
        }
        System.out.println(D+" "+C+" "+B+" "+A);
    }
}
