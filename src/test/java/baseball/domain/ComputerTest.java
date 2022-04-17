package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    public void getResult () {
        //given
        Computer computer = new Computer();
        computer.initBallList();
        //when
        Result judge = computer.judge(BaseballList.createBaseBallList("123"));
        //then
        assertThat(judge).isNotNull();
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