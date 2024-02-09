import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char operator;
        double first_number ,second_number,result;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Choose any operator  + ,-,*./");
        operator=scanner.next().charAt(0);
        System.out.println("Enter First number");
        first_number=scanner.nextDouble();
        System.out.println("Enter second number");
        second_number=scanner.nextDouble();
        switch(operator){
            case '+' :
                result=first_number+second_number;
                System.out.println(first_number+"+"+second_number+"=" +result);
                break;
            case '-':
                result=first_number-second_number;
                System.out.println(first_number+"-"+second_number+"=" +result);
                break;
            case '*':
                result=first_number*second_number;
                System.out.println(first_number+"*"+second_number+"=" +result);
                break;
            case '/':
                result=first_number/second_number;
                System.out.println(first_number+"/"+second_number+"=" +result);
                break;
            default:
                System.out.println("Invalid Operator");

        }
    }
}
