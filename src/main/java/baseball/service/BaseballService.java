package baseball.service;

import baseball.domain.BaseballList;
import baseball.domain.Computer;
import baseball.ui.Input;
import baseball.ui.Output;

public class BaseballService {

    public void play() {
        Computer computer = new Computer();
        computer.initBallList();
        do {
            BaseballList userBaseballList = receiveInput();
        } while (isCorrectAnswer());
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
        return true; // TODO
    }
}
