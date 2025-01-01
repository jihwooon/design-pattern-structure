package design.pattern.singleton;

import java.util.concurrent.atomic.AtomicLong;

public class HolderIdiom {

    private AtomicLong id = new AtomicLong(0);

    private HolderIdiom() {
    }

    private static class SingletonHolderIdiom {

        private static final HolderIdiom instance = new HolderIdiom();
    }

    public static HolderIdiom getInstance() {
        return SingletonHolderIdiom.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
