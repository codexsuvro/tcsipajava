package ThisYear;
import java.util.*;

public class SumOfDigitInsideString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String temp = "";
        for(int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                temp += str.charAt(i);
            }
        }
        int num = Integer.parseInt(temp);
        int sum = 0;
        while(num != 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.println(sum);
    }
}