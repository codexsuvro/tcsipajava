package PreviousYear;
import java.util.*;

public class CountPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        int sum = 0;
        while(input != 0) {
            int rem = input % 10;
            if(isPrime(rem)) {
                sum = (sum * 10) + rem;
            }
            input /= 10;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int rem) {
        int count = 0;
        for(int i = 1; i <= rem; i++) {
            if(rem % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
}
