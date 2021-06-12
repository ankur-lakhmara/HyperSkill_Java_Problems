/*A bus tour of Europe has been very successful. Due to an increase in the number of people who want to go on a tour, the tour company decided to increase the height of the bus. The new height of the bus is exactly N centimeters.

But the tour’s route runs under a lot of bridges, and there is a chance that the bus will crash into one of these bridges. Can you find out if this will happen?

The first line of the input contains the height of the bus and the number of bridges under which the bus passes. The second line contains the heights of these bridges.

You should output "Will not crash" if everything will be alright; otherwise, output "Will crash on bridge i" (where i is the number of the bridge) into which the bus will crash. If the height of a bridge equals the height of the bus, the bus will crash.

 Report a typo
Sample Input 1:

234 8
465 453 981 463 1235 871 475 981
Sample Output 1:

Will not crash
Sample Input 2:

211 5
871 205 123 871 1681
Sample Output 2:

Will crash on bridge 2
*/

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int busHeight = input.nextInt();
        int numberOfBridges = input.nextInt();
        boolean willItCrash = false;
        int[] bridgesHeights = new int[numberOfBridges];
        int bridgeNumber = 0;
        for (int i = 0; i < numberOfBridges; i++) {
            bridgesHeights[i] = input.nextInt();
            if (bridgesHeights[i] > busHeight) {
                willItCrash = false;
            } else if (bridgesHeights[i] <= busHeight) {
                bridgeNumber = i + 1;
                willItCrash = true;
                break;
            }
        }
        if (willItCrash) {
            System.out.println("Will crash on bridge " + bridgeNumber);
        } else {
            System.out.println("Will not crash");
        }
    }
}
