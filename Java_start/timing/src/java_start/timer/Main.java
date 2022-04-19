package java_start.timer;

import java.math.BigDecimal;

public class Main {

    /*
    // Без лямда-выражения
    public static void main(String[] args) {
        Timer timer = new Timer();
        long time = timer.measureTime(new Runnable() {
            @Override
            public void run() {
                new BigDecimal("1234567").pow(100000);
            }
        });
        System.out.println(time);
    }
    */

    // С лямда-выражением, не принимающим параметров:
    public static void main(String[] args) {
        Timer timer = new Timer();
        long time = timer.measureTime(() -> new BigDecimal("1234567").pow(100000));
        System.out.println(time);
    }
}
