import java.util.*;

public class SecondProblem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Phone[] arr = new Phone[4];

        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            arr[i] = new Phone(a, b, c, d);
        }

        String Brand = sc.nextLine();
        String Os = sc.nextLine();
        
        if(findPriceForGivenBrand(arr, Brand) > 0) {
            System.out.println(findPriceForGivenBrand(arr, Brand));
        } else {
            System.out.println("The given Brand is not available");
        }

        if(getPhoneIdBasedOnOs(Os, arr) == null) {
            System.out.println("No phones are available with specified os and price range");
        } else {
            System.out.println(getPhoneIdBasedOnOs(Os, arr).getPhoneId());
        }

        sc.close();

    }

    static class Phone {

        int phoneId;
        String os;
        String brand;
        int price;

        public Phone(int phoneId, String os, String brand, int price) {
            this.phoneId = phoneId;
            this.os = os;
            this.brand = brand;
            this.price = price;
        }

        public int getPhoneId() {
            return phoneId;
        }

        public String getOs() {
            return os;
        }

        public String getBrand() {
            return brand;
        }

        public int getPrice() {
            return price;
        }

    }

    public static int findPriceForGivenBrand(Phone[] arr, String Brand) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getBrand().equalsIgnoreCase(Brand)) {
                sum += arr[i].getPrice();
            }
        }
        return sum;
    }

    public static Phone getPhoneIdBasedOnOs(String Os, Phone[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getOs().equalsIgnoreCase(Os) && arr[i].getPrice() >= 50000) {
                return arr[i];
            }
        }
        return null;
    }
}
