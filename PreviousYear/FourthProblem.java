package PreviousYear;
import java.util.*;

public class FourthProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution[] arr = new Solution[4];
        for(int i = 0; i < arr.length; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            arr[i] = new Solution(a, b, c, d);
        }
        String disease = sc.nextLine();
        int[] res = getPriceByDisease(arr, disease);
        for(int num : res) {
            System.out.println(num);
        }
        sc.close();
    }
    static class Solution {
        String medicineName;
        String batch;
        String disease;
        int price;
        public Solution(String medicineName,
        String batch,
        String disease,
        int price) {
            this.medicineName = medicineName;
            this.batch = batch;
            this.disease = disease;
            this.price = price;
        }
        public String getMedicineName() {
            return medicineName;
        }
        public String getBatch() {
            return batch;
        }
        public String getDisease() {
            return disease;
        }
        public int getPrice() {
            return price;
        }
    }
    public static int[] getPriceByDisease(Solution[] arr, String disease) {
        int[] arr2 = new int[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].getDisease().equals(disease)) {
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length - 1] = arr[i].getPrice();
                Arrays.sort(arr2);
            }
        }
        return arr2;
    }
}
