package PreviousYear;
import java.util.*;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().replace(" ", "");
        sc.close();
        LinkedHashMap<Character, Integer> list = new LinkedHashMap<>();
        for(int i = 0; i < str.length(); i++) {
            if(!list.containsKey(str.charAt(i))) {
                list.put(str.charAt(i), 1);
            } else {
                list.put(str.charAt(i), list.get(str.charAt(i)) + 1);
            }
        }
        for(HashMap.Entry<Character, Integer> data : list.entrySet()) {
            System.out.println(data.getKey() + ": " + data.getValue());
        }
    }
}
