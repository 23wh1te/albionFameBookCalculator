import java.util.Scanner;

public class fameCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tierOfFameBooks = {1000, 2000, 5000, 10000, 20000, 50000, 100000, 200000};
        int i = 0;
        int fame = 0;
        while (i < 8) {
            System.out.println("Number of T" + (i + 1) + " books");
            int numberOfBooks = scanner.nextInt();
            fame = fame + (numberOfBooks * tierOfFameBooks[i]);

            i++;
        }
        System.out.println("You have " + fame + " fame in fame books");
    }
}