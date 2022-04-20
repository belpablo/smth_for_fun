/**
 * Требуется реализорвать метод левых треугольников для численного интегрирования
 * скалярной функции на отрезке [a, b] с точностью не превышающей 1e-6
 */

import java.util.function.DoubleUnaryOperator;

public class Main {

    public static void main(String[] args) {

        // Тесты:

        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(integrate(x -> Math.sin(x) / x, 1, 5));//0.603848
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {

        // Численное интегрирование на динамической сетке (eps = const = 1e-6):

        final var eps = 1e-6;

        // Пробуем разные шаги сетки формата eps = 1e-lg_eps, где 0 < lg_eps < 7 :

        int grid_len;
        double res = f.applyAsDouble(a) * (b - a);
        double[] res_arr = new double[7];
        res_arr[0] = res;

        for (int lg_eps = 1; lg_eps < 7; lg_eps ++) {

            grid_len = (int) ((b - a) * Math.pow(10, lg_eps)) + 1;

            res = 0.0;
            for (int i = 1; i < grid_len; i++) {
                res += f.applyAsDouble(a + (i * eps)) * eps;
            }

            res_arr[lg_eps] = res;
            if (Math.abs(res_arr[lg_eps] - res_arr[lg_eps - 1]) < eps) {
                System.out.println(lg_eps);
                break;
            }
        }

        return res;
    }
}