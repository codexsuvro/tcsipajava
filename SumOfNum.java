import java.util.*;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        int sum = 0;
        for(String str : arr) {
            if(str.replaceAll("[0-9]", "").length() == str.length()) {
                sum += Integer.parseInt(str);
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
