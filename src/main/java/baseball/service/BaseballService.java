package baseball.service;

import baseball.domain.BaseballList;
import baseball.domain.Computer;
import baseball.domain.Result;
import baseball.ui.Input;
import baseball.ui.Output;

public class BaseballService {

    public static final int CORRECT_NUMBER = 3;
    private Result result;

    public void play() {
        Computer computer = new Computer();
        computer.initBallList();
        do {
            BaseballList userBaseballList = receiveInput();
            this.result = computer.judge(userBaseballList);
            Output.printResult(this.result.toString());
        } while (!isCorrectAnswer());
        Output.printBaseballEnd();
    }

    private BaseballList receiveInput() {
        try {
            return BaseballList.createBaseBallList(Input.receiveInput());
        } catch (IllegalArgumentException e) {
            Output.printError(e.getMessage());
            return receiveInput();
        }
    }

    private boolean isCorrectAnswer(){
        return result.getStrikeCount() == CORRECT_NUMBER;
    }
}
