public class Task4 {
    public static void main(String[] args) {
        int n = 10;
        int factor1 = 1;
        System.out.println("   1  2  3  4  5  6  7  8  9  10");
        int multiplicationResult = 1;
        while (factor1 <= n) {
            if (factor1 < 10) {
                System.out.printf(factor1 + " |");
            } else
                System.out.printf(factor1 + "|");
            int factor2 = 1;
            while (factor2 <= n) {
                multiplicationResult = factor1 * factor2;
                if (multiplicationResult < 10) {
                    System.out.printf(multiplicationResult + "  ");
                } else
                    System.out.printf(multiplicationResult + " ");
                factor2++;
            }
            System.out.println();
            factor1++;
        }
    }
}