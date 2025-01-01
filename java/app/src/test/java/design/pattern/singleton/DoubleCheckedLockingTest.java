package design.pattern.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

class DoubleCheckedLockingTest {

    @Test
    void sameInstance() {
        DoubleCheckedLocking instance1 = DoubleCheckedLocking.getInstance();
        DoubleCheckedLocking instance2 = DoubleCheckedLocking.getInstance();

        assertThat(instance1).isSameAs(instance2);
    }

    @Test
    void incrementId() {
        DoubleCheckedLocking instance = DoubleCheckedLocking.getInstance();
        long id1 = instance.getId();
        long id2 = instance.getId();

        assertThat(id1).isEqualTo(1L);
        assertThat(id2).isEqualTo(2L);
    }

    @Test
    void getId_threadSafe() throws InterruptedException {
        int numberOfThreads = 1000;
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);

        Set<Long> generatedIds = new HashSet<>();

        for (int i = 0; i < numberOfThreads; i++) {
            executor.execute(() -> {
                long id = DoubleCheckedLocking.getInstance().getId();
                synchronized (generatedIds) {
                    generatedIds.add(id);
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        assertThat(generatedIds.size()).isEqualTo(numberOfThreads);
    }
}
