package baseball.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BaseballTest {

    @Test
    public void createBaseball() {
        //given & when & then
        assertDoesNotThrow(()->{
            new Baseball(1);
        });
    }

    @Test
    public void throwExceptionWhenCreateBaseballWithInvalidArgument() {
        // given & when & then
        assertThrows(IllegalArgumentException.class, () -> {
            new Baseball(-1);
        });
    }

}