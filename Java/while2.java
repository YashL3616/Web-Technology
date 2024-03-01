import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n");
        n = scan.nextInt();
        int count = 0, i = 1;

        // count holds the factors count.
        while (i <= n) {
            // if i is a factor of n i.e. remainder 0.
            if (n % i == 0) {
                // factor count incremented.
                count++;
            }
            // increment i, to take the next number.
            i++;
        }

        // If only two factors found, it is prime else not.
        if (count == 2) {
            System.out.println("It is prime");
        } else {
            System.out.println("It is not prime");
        }
    }
}
