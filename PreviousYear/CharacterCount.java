package PreviousYear;
import java.util.*;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        int count = 1;
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)) {
                count++;
            } else {
                result.append(str.charAt(i-1)).append(count);
                count = 1;
            }
        }
        System.out.println(result.append(str.charAt(str.length() - 1)).append(count));
        sc.close();
    }
}
