//Calculation.java
class Calculation {
    int result;
    
    public void addition(int x, int y) {
        result = x + y;
        System.out.println("The sum of the given numbers: " + result);
    }
    
    public void subtraction(int x, int y) {
        result = x - y;
        System.out.println("The difference between the given numbers: " + result);
    }
}

//MyCalculation.java
public class MyCalculation extends Calculation {
    public void multiplication(int x, int y) {
        result = x * y;
        System.out.println("The product of the given numbers: " + result);
    }
    
    public static void main(String args[]) {
        int a = 20, b = 10;
        MyCalculation demo = new MyCalculation();
        demo.addition(a, b);
        demo.subtraction(a, b);
        demo.multiplication(a, b);
    }
}
