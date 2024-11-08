package PreviousYear;
import java.util.*;

public class CountLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  str = sc.nextLine();
        sc.close();
        int count = 0;
        for(int  i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                count++;
            }
        }
        System.out.println(count);
    }
}
