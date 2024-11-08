package PreviousYear;
import java.util.*;

public class FindLetterOfEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        StringBuilder res = new StringBuilder();
        String[] arr = str.split(" ");
        for(int i = 0; i < arr.length; i++) {
            res.append(arr[i].charAt(0));
        }
        System.out.println(res.toString().toUpperCase());
    }
}
