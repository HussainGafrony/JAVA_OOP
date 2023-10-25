public class Calc {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        if (a < b) {
            System.out.println("a must be greater than or equal to b.");
            return a;
        }
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
