package design.pattern.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EagerLoadingTest {

    @Test
    @DisplayName("두 객체가 동일 여부 확인")
    void sameInstance() {
        EagerLoading instance1 = EagerLoading.getInstance();
        EagerLoading instance2 = EagerLoading.getInstance();

        assertThat(instance1).isSameAs(instance2);
    }

    @Test
    @DisplayName("객체가 생성 될 때마다 id가 증가")
    void incrementAndGet() {
        EagerLoading instance = EagerLoading.getInstance();

        long id1 = instance.getId();
        long id2 = instance.getId();

        assertThat(id1).isEqualTo(1);
        assertThat(id2).isEqualTo(2);
    }
}
