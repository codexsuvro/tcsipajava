import java.util.*;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String test = sc.next();
        sc.close();
        int c = 0;
        String[] arr = str.split(" ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equalsIgnoreCase(test)) {
                c++;
            }
        }
        System.out.println(c);
    }
}
