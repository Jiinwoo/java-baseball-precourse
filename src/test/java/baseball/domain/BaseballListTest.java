package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class BaseballListTest {

    @Test
    public void createBaseballList () {
        //given & when & then
        assertDoesNotThrow(()->{
            BaseballList.createBaseBallList();
        });
        //given & when & then
        assertDoesNotThrow(()->{
            BaseballList.createBaseBallList("123");
        });
    }

    @Test
    public void throwExceptionWhenCreat() {
        //given & when & then
        IllegalArgumentException error1 = assertThrows(IllegalArgumentException.class, () -> {
            BaseballList.createBaseBallList("1234");
        });
        //then
        assertThat(error1).hasMessage("올바르지 않은 공 숫자입니다.");
        //given & when & then
        IllegalArgumentException error2 = assertThrows(IllegalArgumentException.class, () -> {
            BaseballList.createBaseBallList("");
        });
        //then
        assertThat(error2).hasMessage("올바르지 않은 공 숫자입니다.");

        //given & when & then
        IllegalArgumentException error3 = assertThrows(IllegalArgumentException.class, () -> {
            BaseballList.createBaseBallList("111");
        });
        //then
        assertThat(error3).hasMessage("중복된 공이 발견되었습니다.");

    }

}