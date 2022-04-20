/**
 * Требуется реализорвать метод левых треугольников для численного интегрирования
 * скалярной функции на отрезке [a, b] с точностью не превышающей 1e-6
 */

import java.util.function.DoubleUnaryOperator;

public class Main {

    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(integrate(x -> Math.sin(x) / x, 1, 5));//0.603848
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {

        double res = 0.0;
        double eps = 1e-6;
        int grid_len = (int) (((b - a) / eps) + 1);

        for (int i = 1; i < grid_len; i++) {
            res += f.applyAsDouble(a + (i * eps)) * eps;
        }

        return res;
    }
}