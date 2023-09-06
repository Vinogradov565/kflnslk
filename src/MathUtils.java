public class MathUtils {
    public static final double PI = 3.141592653589793;
    public static final double E = 2.718281828459045;

    public static <T extends Comparable<T>> T min(T a, T b) {
        return a.compareTo(b) < 0 ? a : b;
    }

    public static void main(String[] args) {
        int intMin = min(5, 3);
        double doubleMin = min(3.14, 2.71);

        System.out.println("Минимальное из 5 и 3: " + intMin);
        System.out.println("Минимальное из 3.14 и 2.71: " + doubleMin);
    }
}