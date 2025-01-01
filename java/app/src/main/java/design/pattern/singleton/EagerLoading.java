package design.pattern.singleton;

import java.util.concurrent.atomic.AtomicLong;

public class EagerLoading {

    private AtomicLong id = new AtomicLong(0);
    private static final EagerLoading instance = new EagerLoading();

    private EagerLoading() {
    }

    public static EagerLoading getInstance() {
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
