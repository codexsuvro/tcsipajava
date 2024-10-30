import java.util.*;

public class FirstProblem {

    /* Create main method in the FirstProblem class */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TravelAgencies[] arr = new TravelAgencies[4];

        for (int i = 0; i < 4; i++) {

            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            boolean e = sc.nextBoolean();
            arr[i] = new TravelAgencies(a, b, c, d, e);
        }

        int regNo = sc.nextInt();
        sc.nextLine(); // Consume newline
        String packageType = sc.nextLine();

        int result = findAgencyWithHighestPackagePrice(arr);
        System.out.println(result);

        TravelAgencies travel = agencyDetailsforGivenIdAndType(arr, regNo, packageType);
        if (travel != null) {
            System.out.println(travel.getAgencyName() + ":" + travel.getPrice());
        } else {
            System.out.println("No matching agency found.");
        }

        sc.close();
    }

    /* Make TravelAgencies a static inner class */

    static class TravelAgencies {

        int regNo;
        String agencyName;
        String packageType;
        int price;
        boolean flightFacility;

        public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
            this.regNo = regNo;
            this.agencyName = agencyName;
            this.packageType = packageType;
            this.price = price;
            this.flightFacility = flightFacility;
        }

        public int getRegNo() {
            return regNo;
        }

        public String getAgencyName() {
            return agencyName;
        }

        public String getPackageType() {
            return packageType;
        }

        public int getPrice() {
            return price;
        }

        public boolean getFlightFacility() {
            return flightFacility;
        }
    }

    /*
     * findAgencyWithHighestPackagePrice method:
     * This method will take array of TravelAgencies objects as an input parameter
     * and return the package price from this given array of objects.
     */

    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] arr) {
        int price = arr[0].getPrice();
        for (int i = 1; i < arr.length; i++) { 
            // Start from 1 to avoid comparing the first element with itself
            if (price < arr[i].getPrice()) {
                price = arr[i].getPrice();
            }
        }
        return price;
    }

    /*
     * agencyDetailsforGivenIdAndType method:
     * This method will take three i/p parameters- array of TravelAgencies objects,
     * String regNo, and String packageType. The method will return the
     * TravelAgencies object
     * based on the following conditions:
     * 1. flightFacility should be available.
     * 2. Input parameters should be matched with the regNo and packageType.
     */

    public static TravelAgencies agencyDetailsforGivenIdAndType(TravelAgencies[] arr, int regNo, String packageType) {
        for (TravelAgencies agency : arr) {
            if (agency.getFlightFacility() && agency.getRegNo() == regNo
                    && agency.getPackageType().equals(packageType)) {
                return agency;
            }
        }
        return null;
    }
}
