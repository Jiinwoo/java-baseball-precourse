package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;

class ComputerTest {

    @Test
    public void getResult () {
        //given
        MockedStatic<Randoms> mock = mockStatic(Randoms.class);
        mock.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt())).thenReturn(1, 2, 3);
        Computer computer = new Computer();
        computer.initBallList();
        //when
        Result judge = computer.judge(BaseballList.createBaseBallList("123"));
        //then
        assertThat(judge).isNotNull();
        mock.close();
    }

    @Test
    public void throwExceptionWithoutInit() {
        //given
        Computer computer = new Computer();
        //when & then
        assertThatThrownBy(()-> {
            computer.judge(BaseballList.createBaseBallList("123"));
        }).isInstanceOf(AssertionError.class);
    }
}