import java.util.*;

public class SpaceCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        int l = 0, s = 0;
        for(char ch : arr) {
            if(Character.isAlphabetic(ch)) {
                l++;
            } else if(ch == ' ') {
                s++;
            }
        }
        System.out.println("Number of character: " + l + " and Number of spacing: " + s);
        sc.close();
    }
}
