import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String res = "";
        for(int i = 0; i < str.length(); i++) {
            if(res.indexOf(str.charAt(i)) == -1) {
                res = res + str.charAt(i);
            }
        }
        System.out.println(res);
    }
}
