import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n");
        n = scan.nextInt();
        // variable to store n factorial value
        int nfact = 1;
        // for each value of i from 1 to n
        for (int i = 1; i <= n; i++) {
            // multiply i to nfact and
            // store the result in the same variable.
            nfact = nfact * i;
        }
        System.out.println("factorial value is - " + nfact);
    }
}
