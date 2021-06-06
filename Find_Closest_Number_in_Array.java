import java.util.Scanner;

public class Find_Closest_Number_in_Array {
    public static void main(String[]args){
        int[] arr = {2,5,7,8,9,11,17,15};
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int Distance = Math.abs(arr[0]-a);
        int index = 0;
        for(int i=1; i<arr.length;i++){
            int cDistance = Math.abs(arr[i]-a);
            if(cDistance<Distance){
                index = i;
                Distance = cDistance;
            }
        }
        int result = arr[index];
        System.out.println(result);
    }
}
