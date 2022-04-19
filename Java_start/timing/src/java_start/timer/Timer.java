/**
 * Код для замеров времени в милисикундах), пригодный к переиспользованию,
 * поскольку работаем с объектов runable
 */

package java_start.timer;

public class Timer {
    public long measureTime(Runnable runnable) {
        long startTime = System.currentTimeMillis();
        runnable.run();
        return System.currentTimeMillis() - startTime;
    }
}
