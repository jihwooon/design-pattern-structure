package design.pattern;

import java.util.concurrent.atomic.AtomicLong;

/** 싱글톤 패턴 */
public class IdGenerator {

    private AtomicLong id = new AtomicLong(0);
    private static final IdGenerator instance = new IdGenerator();

    private IdGenerator() {
    }

    public static IdGenerator getInstance() {
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
