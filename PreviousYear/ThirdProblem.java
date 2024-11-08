package PreviousYear;
import java.util.*;

public class ThirdProblem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Solution[] arr = new Solution[4];

        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            String e = sc.nextLine();
            arr[i] = new Solution(a, b, c, d, e);
        }

        String location = sc.nextLine();
        String institutionName = sc.nextLine();

        if (FindNumClearancedByLoc(arr, location) < 0) {
            System.out.println("There are no cleared students in this particular location");
        } else {
            System.out.println(FindNumClearancedByLoc(arr, location));
        }

        if (UpdateInstitutionGrade(institutionName, arr) == null) {
            System.out.println("No Institute is available with the specified name");
        } else {
            System.out.println(UpdateInstitutionGrade(institutionName, arr).getInstitutionName() + "::"
                    + UpdateInstitutionGrade(institutionName, arr).getGrade());
        }

        sc.close();

    }

    public static int FindNumClearancedByLoc(Solution[] arr, String location) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getLocation().equalsIgnoreCase(location)) {
                sum += arr[i].getNoOfStudentsCleared();
            }
        }
        return sum;
    }

    public static Solution UpdateInstitutionGrade(String institutionName, Solution[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getInstitutionName().equalsIgnoreCase(institutionName)) {
                return arr[i];
            }
        }
        return null;
    }

    static class Solution {

        int institutionId;
        String institutionName;
        int noOfStudentsPlaced;
        int noOfStudentsCleared;
        String location;
        String grade;

        public Solution(int institutionId,
                String institutionName,
                int noOfStudentsPlaced,
                int noOfStudentsCleared,
                String location) {
            this.institutionId = institutionId;
            this.institutionName = institutionName;
            this.noOfStudentsPlaced = noOfStudentsPlaced;
            this.noOfStudentsCleared = noOfStudentsCleared;
            this.location = location;
        }

        public void setInstitutionId(int institutionId) {
            this.institutionId = institutionId;
        }

        public void setInstitutionName(String institutionName) {
            this.institutionName = institutionName;
        }

        public void setNoOfStudentsPlaced(int noOfStudentsPlaced) {
            this.noOfStudentsPlaced = noOfStudentsPlaced;
        }

        public void setNoOfStudentsCleared(int noOfStudentsCleared) {
            this.noOfStudentsCleared = noOfStudentsCleared;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public int getInstitutionId() {
            return institutionId;
        }

        public String getInstitutionName() {
            return institutionName;
        }

        public int getNoOfStudentsPlaced() {
            return noOfStudentsPlaced;
        }

        public int getNoOfStudentsCleared() {
            return noOfStudentsCleared;
        }

        public String getLocation() {
            return location;
        }

        public String getGrade() {
            if (((noOfStudentsPlaced * 100) / noOfStudentsCleared) >= 80) {
                grade = "A";
            } else {
                grade = "B";
            }
            return grade;
        }

    }

}
