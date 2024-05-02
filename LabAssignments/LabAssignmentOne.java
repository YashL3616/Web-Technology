import java.util.Scanner;
public class EvenOdd1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number :");
        int number= sc.nextInt();
        if(number%2==0)
        {
            System.out.println(number +" is Even Number");
        }
        else
        {
            System.out.println(number +" is Odd Number");
        }

        
        System.out.println("Using ternary Check :");
        int num=sc.nextInt();
       // int res=(num%2==0? "Even":"Odd"); wrong because even or odd is string not int..res stores string even or odd
        String res=(num%2==0? "Even":"Odd");
        System.out.println(res);
        sc.close();
    }

}
