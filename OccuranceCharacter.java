import java.util.*;

public class OccuranceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        sc.close();
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.toLowerCase().charAt(i) == ch) {
                count++;
            }
        }
        System.out.println(count);
    }
}
