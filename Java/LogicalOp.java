class Ex3 {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 6;
        boolean d = a < b; // true
        boolean e = b > c; // false
        boolean f = b >= c; // true
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        int x = 20, y = 15, z = 35;
        boolean p = (x > y && x > z); // false
        boolean q = (x > y || x > z); // true
        boolean r = !(x > y); // true
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
    }
}
