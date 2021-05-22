import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] payments = new int[size];
        for (int i = 0; i < size; i++) {
            payments[i] = scanner.nextInt();
        }
        int[] percents = new int[size];
        for (int i = 0; i < size; i++) {
            percents[i] = scanner.nextInt();
        }
        double max = payments[0] * percents[0];
        int index = 1;
        for (int i = 1; i < size; i++) {
            int payment = payments[i] * percents[i];
            if (payment == 0) {
                continue;
            }
            if (payment > max) {
                max = payment;
                index = i+1;
            }
        }
        System.out.println(index);
    }
}
