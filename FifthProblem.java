import java.util.*;

public class FifthProblem {
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
        String genre = sc.nextLine();
        int[] res = getMovieByGenre(arr, genre);
        for(int num : res) {
            if(num > 5000) {
                System.out.println("High Budget Movie");
            } else {
                System.out.println("Low Budget Movie");
            }
        }
        sc.close();
    }
    static class Solution {
        String movieName;
        String company;
        String genre;
        int budget;
        public Solution(String movieName,
        String company,
        String genre,
        int budget) {
            this.movieName = movieName;
            this.company = company;
            this.genre = genre;
            this.budget = budget;
        }
        public String getMovieName() {
            return movieName;
        }
        public String getCompany() {
            return company;
        }
        public String getGenre() {
            return genre;
        }
        public int getBudget() {
            return budget;
        }
    }
    public static int[] getMovieByGenre(Solution[] arr, String genre) {
        int[] arr2 = new int[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].getGenre().equalsIgnoreCase(genre)) {
                arr2 = Arrays.copyOf(arr2, arr2.length + 1);
                arr2[arr2.length - 1] = arr[i].getBudget();
            }
        }
        return arr2;
    }
}
