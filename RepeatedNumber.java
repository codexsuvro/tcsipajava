import java.util.*;

public class RepeatedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                System.out.print(str.charAt(i));
            } else if (Character.isDigit(str.charAt(i))) {
                for (int j = 0; j < i; j++) {
                    System.out.print(str.charAt(i - 1));
                }
            }
        }
        sc.nextLine();
        sc.close();
    }
}
