import java.util.*;

public class RemoveLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ch = sc.nextLine();
        System.out.println(str.replace(ch, ""));
        sc.close();
    }
}
