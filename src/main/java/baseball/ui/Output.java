package baseball.ui;

import camp.nextstep.edu.missionutils.Console;

public class Output {
    private static final String ASK_KEEP_PLAY_GAME = "게임을 새로 시작하시려면 1, 종료하면 2를 입력해주세요.";
    private static final String ENABLE_ONE_OR_TWO = "1 또는 2값 만 입력해주세요.\n";

    public static void printKeepPlayGame() {System.out.print(ASK_KEEP_PLAY_GAME);}
    public static void printError() {System.out.print(ENABLE_ONE_OR_TWO);}
}
