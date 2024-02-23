import java.util.Scanner;

 class Ex4 {
    public static void main(String[] args) {
        int a = 7, b = 4;
        int c = a + b;
        int d = a - b;
        int e = a / b;
        int f = a * b;
        int g = a % b;
        System.out.println(c); // 11
        System.out.println(d); // 3
        System.out.println(e); // 1
        System.out.println(f); // 28
        System.out.println(g); // 3

        int x = 10, y = 10;
        int p, q;
        p = x++; // value of p is 10 and x is 11.
        q = ++y; // value of q is 11 and y is 11
        System.out.println("p is " + p + " x is " + x);
        System.out.println("q is " + q + " y is " + y);
    }
}
