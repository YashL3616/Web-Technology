class callbyref{
    static void change(int[] b) {
        b[1] = 0;
    }

    public static void main(String[] args) {
        int a[] = {10, 20, 30};
        change(a);
        System.out.println(a[1]); // 0
    }
}
