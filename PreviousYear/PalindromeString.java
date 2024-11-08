package PreviousYear;
import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        for(int i = 0; i < arr.length; i++) {
            if(isPalindrome(arr[i])) {
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
    public static boolean isPalindrome(String str) {
        boolean same = true;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                same = false;
                break;
            }
        }
        return same ? true : false;
    }
}
