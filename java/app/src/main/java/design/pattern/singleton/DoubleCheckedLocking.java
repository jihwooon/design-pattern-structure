package design.pattern.singleton;

import java.util.concurrent.atomic.AtomicLong;

public class DoubleCheckedLocking {

    private AtomicLong id = new AtomicLong(0);
    private static DoubleCheckedLocking instance;

    private DoubleCheckedLocking() {
    }

    public static DoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLocking.class) {
                instance = new DoubleCheckedLocking();
            }
        }

        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
