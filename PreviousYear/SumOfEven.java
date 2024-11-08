package PreviousYear;
import java.util.*;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Array: ");
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int num : arr) {
            if(num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
