package baseball.service;

import baseball.domain.Computer;

public class BaseballService {

    public void play() {
        Computer computer = new Computer();
        computer.initBallList();
        do {

        } while (isCorrectAnswer());
    }

    private boolean isCorrectAnswer(){
        return true; // TODO
    }
}
