package design.pattern;

import static org.assertj.core.api.Assertions.assertThat;

import design.pattern.singleton.IdGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IdGeneratorTest {

    @Test
    @DisplayName("싱글톤 패턴을 적용한 객체 비교")
    public void singletonTest() {
        IdGenerator singleton1 = IdGenerator.getInstance();
        IdGenerator singleton2 = IdGenerator.getInstance();

        assertThat(singleton1).isSameAs(singleton2);
    }

    @Test
    @DisplayName("싱글톤 패턴을 적용한 값 비교")
    public void singletonValueTest() {
        long id1 = IdGenerator.getInstance().getId();
        long id2 = IdGenerator.getInstance().getId();

        assertThat(id1).isEqualTo(1);
        assertThat(id2).isEqualTo(2);

        assertThat(id1).isNotSameAs(id2);
    }
}
