package design.pattern.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

class LazyLoadingTest {

    @Test
    void sameInstance() {
        LazyLoading instance1 = LazyLoading.getInstance();
        LazyLoading instance2 = LazyLoading.getInstance();

        assertThat(instance1).isSameAs(instance2);
    }

    @Test
    void incrementId() {
        LazyLoading instance = LazyLoading.getInstance();
        long id1 = instance.getId();
        long id2 = instance.getId();

        assertThat(id1).isEqualTo(1);
        assertThat(id2).isEqualTo(2);
    }

    @Test
    void incrementId_threadSage() throws InterruptedException {
        int THREAD_SIZE = 1000;
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_SIZE);
        Set<Long> generatedIds = new HashSet<>();

        LazyLoading instance = LazyLoading.getInstance();

        for (int i = 0; i < THREAD_SIZE; i++) {
            executor.execute(() -> {
                long id = instance.getId();
                synchronized (generatedIds) {
                    generatedIds.add(id);
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        assertThat(generatedIds.size()).isEqualTo(THREAD_SIZE);
    }
}
