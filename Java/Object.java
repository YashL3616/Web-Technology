import java.util.LinkedList;

class ShoppingCart {
    private LinkedList<String> products = new LinkedList<>();

    public void addToCart(String product) {
        // added to the list
        products.add(product);
    }

    public void order() {
        // displays the selected products.
        System.out.println("Ordered Products");
        System.out.println(products);
    }
}

class Main1 {
    public static void main(String[] args) {
        // cart1 is an object to hold the selections
        ShoppingCart cart1 = new ShoppingCart();
        // elements added to the cart1
        cart1.addToCart("a");
        cart1.addToCart("b");
        cart1.addToCart("c");
        // order the selected elements in cart1
        cart1.order();
        // Here cart1 is holding the data or selections
        // between the operation calls
    }
}
