/*Profit

Ann puts M
M
 money in the bank. The bank increases Ann's deposit by P
P
 percent every year. Ann wants to know how many years should pass until her deposit in the bank reaches K
K
 money. Can you help her to answer this question?

The input contains three integers M,P,K
M
,
P
,
K
. It is guaranteed that all numbers are positive and K≥M
K
≥
M
.
Output the answer to Ann's question.


Sample Input: 
1 100 8

Sample Output: 
3
*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
              
        Scanner scan = new Scanner(System.in);
        double m = scan.nextDouble();
        int p = scan.nextInt();
        double k = scan.nextDouble();
        int y = 0;
        if (m != k) {
            while (k > m) {
                y++;
                m += m * p / 100;
            }
        }
        System.out.printf("%d %n", y);
    }
}
