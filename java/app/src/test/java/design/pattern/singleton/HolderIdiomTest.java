package design.pattern.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class HolderIdiomTest {

    @Test
    void sameInstance() {
        HolderIdiom instance1 = HolderIdiom.getInstance();
        HolderIdiom instance2 = HolderIdiom.getInstance();

        assertThat(instance1).isSameAs(instance2);
    }

    @Test
    void incrementAndGet() {
        HolderIdiom instance = HolderIdiom.getInstance();
        long id1 = instance.getId();
        long id2 = instance.getId();

        assertThat(id1).isEqualTo(1);
        assertThat(id2).isEqualTo(2);
    }
}
