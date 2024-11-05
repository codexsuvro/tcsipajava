import java.util.*;

public class ConsonentAtOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        sc.close();
        for(int  i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(i % 2 == 0) {
                if(isConsonent(ch)) {
                    result.append(ch);
                }
            }
        }
        System.out.println(result);
    }
    public static boolean isConsonent(char c) {
        char ch = Character.toLowerCase(c);
        return "bcdfghjklmnpqrstvwxyz".indexOf(ch) != -1;
    }
}
