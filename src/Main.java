import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        double angle = 0.5;

        double arcsinResult = Math.asin(angle);
        System.out.println("Арксинус: " + arcsinResult);

        double arccosResult = Math.acos(angle);
        System.out.println("Аркосинус: " + arccosResult);

        double arctanResult = Math.atan(angle);
        System.out.println("Арктангенс: " + arctanResult);
    }
}
