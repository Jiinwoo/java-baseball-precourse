package baseball.ui;

import camp.nextstep.edu.missionutils.Console;

public class Input {
    public static String receiveKeepFlagNumber() {
        Output.printKeepPlayGame();
        return Console.readLine();
    }
}
