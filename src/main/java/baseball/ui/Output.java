package baseball.ui;

public class Output {
    private static final String REQUIRE_NUMBER_INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String ASK_KEEP_PLAY_GAME = "게임을 새로 시작하시려면 1, 종료하면 2를 입력해주세요.";
    private static final String ENABLE_ONE_OR_TWO = "1 또는 2값 만 입력해주세요.\n";
    public static final String BASE_BALL_END = "3개의 숫자를 모두 맞추셨습니다! 게임 종료";

    public static void printRequestNumberInput() {System.out.print(REQUIRE_NUMBER_INPUT_MESSAGE);}
    public static void printKeepPlayGame() {System.out.print(ASK_KEEP_PLAY_GAME);}
    public static void printGameError() {System.out.print(ENABLE_ONE_OR_TWO);}
    public static void printError(String e) {System.out.print(e);}
    public static void printResult(String result) {System.out.print(result);}
    public static void printBaseballEnd() {System.out.println(BASE_BALL_END);}
}
