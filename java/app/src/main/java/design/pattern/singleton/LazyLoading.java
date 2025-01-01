package design.pattern.singleton;

import java.util.concurrent.atomic.AtomicLong;

public class LazyLoading {

    private AtomicLong id = new AtomicLong(0);
    private static LazyLoading instance;

    private LazyLoading() {
    }

    public static synchronized LazyLoading getInstance() {
        if (instance == null) {
            instance = new LazyLoading();
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
