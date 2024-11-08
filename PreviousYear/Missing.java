package PreviousYear;
import java.util.*;

public class Missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> missingNumbers = new ArrayList<>();
        for(int j = arr[0]; j < arr[arr.length - 1]; j++) {
            boolean found = false;
            for(int num : arr) {
                if(num == j) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                missingNumbers.add(j);
            }
        }
        for(int number : missingNumbers) {
            System.out.println(number + " ");
        }
        sc.close();
    }
}
