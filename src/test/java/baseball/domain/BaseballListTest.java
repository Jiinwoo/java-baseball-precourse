package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;

class BaseballListTest {

    @Test
    public void createBaseballList() {
        //given & when & then
        assertDoesNotThrow(() -> {
            BaseballList.createBaseBallList();
        });
        //given & when & then
        assertDoesNotThrow(() -> {
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

    @Test
    public void countStrike() {
        //given
        MockedStatic<Randoms> mock = mockStatic(Randoms.class);
        mock.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt())).thenReturn(1, 2, 3);
        BaseballList computedBaseballList = BaseballList.createBaseBallList();
        BaseballList userBaseballList = BaseballList.createBaseBallList("123");
        //when
        int countStrike = computedBaseballList.countStrike(userBaseballList);
        //then
        assertThat(countStrike).isEqualTo(3);
        mock.close();
    }

    @Test
    public void countBall() {
        //given
        MockedStatic<Randoms> mock = mockStatic(Randoms.class);
        mock.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt())).thenReturn(7, 1, 3);
        BaseballList computedBaseballList = BaseballList.createBaseBallList();
        BaseballList userBaseballList = BaseballList.createBaseBallList("671");
        //when
        int countBall = computedBaseballList.countBall(userBaseballList);
        //then
        assertThat(countBall).isEqualTo(2);
        mock.close();
    }

}