package InheritanceYash;

public class Base {
    void sleep()
    {
        System.out.println("Base is sleeping");
    }
    void wake()
    {
        System.out.println("Base is woked");
    }
}


package InheritanceYash;

public class Derived1 extends Base {
    void walk()
    {
        System.out.println("Base is walking");
    }
}

package InheritanceYash;

public class Derived2 extends Base{
    void Run()
    {
        System.out.println("Base is running");
    }
}

//main.java
package InheritanceYash;

public class Main {
    public static void main(String[] args) {
        Base obj=new Base();
        obj.sleep();

        Derived1 obj1=new Derived1();
        obj1.sleep(); //uses base function
        obj1.walk();  //uses its own
    }
}
