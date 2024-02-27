class callbyval{
    static void change(int m) {
        m = m + 5;
    }

    public static void main(String[] args) {
        int n = 10;
        change(n);
        System.out.println(n); // 10
    }
}
