public class Task3 {
    public static void main(String[] args) {
        int n = 10;
        int fibonacci1 = 1, fibonacci2 = 1;
        System.out.println(fibonacci1);
        System.out.println(fibonacci2);
        int fibonacci, i = 3;
        while (i <= n) {
            fibonacci = fibonacci1 + fibonacci2;
            fibonacci1 = fibonacci2;
            fibonacci2 = fibonacci;
            System.out.println(fibonacci);
            i++;
        }
    }
}
