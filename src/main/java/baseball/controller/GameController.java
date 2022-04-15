package baseball.controller;

import baseball.service.BaseballService;
import baseball.ui.Input;
import baseball.ui.Output;
import camp.nextstep.edu.missionutils.Console;

public class GameController {

    private static final String KEEP = "1";
    private static final String STOP = "2";
    private static final int VALID_KEEP_OR_STOP_SIZE = 1;
    private static final char ZERO_CHAR = '0';

    public void start () {
        do {
            BaseballService baseballService = new BaseballService();
            baseballService.play();
        } while (keepPlayGame());
    }

    private boolean keepPlayGame() {
        try {
            String input = Input.receiveKeepFlagNumber();
            validInput(input);
            return input.equals(KEEP);
        } catch (IllegalArgumentException e) {
            Output.printError();
            return keepPlayGame();
        }
    }
    private void validInput (String input) {
        if (input.length() != VALID_KEEP_OR_STOP_SIZE) {
            throw new IllegalArgumentException("올바르지 않은 입력입니다.");
        }

        int inputNumber = (input.charAt(0) - ZERO_CHAR);

        if (inputNumber != Integer.parseInt(KEEP) && inputNumber != Integer.parseInt(STOP)) {
            throw new IllegalArgumentException("올바르지 않은 입력입니다.");
        }
    }
}
