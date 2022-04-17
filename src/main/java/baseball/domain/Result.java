package baseball.domain;

/**
 * ui 영역..? DTO 인가
 */
public class Result {
    public static final int ZERO = 0;
    public static final String RESULT_NOTHING_MESSAGE = "낫싱";
    public static final String RESULT_STRIKE_MESSAGE = "스트라이크";
    public static final String RESULT_BALL_MESSAGE = "볼 ";
    private final int strikeCount;
    private final int ballCount;

    public Result(int strikeCount, int ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.strikeCount == ZERO && this.ballCount == ZERO) {
            sb.append(RESULT_NOTHING_MESSAGE);
        }
        if (this.ballCount != ZERO) {
            sb.append(ballCount).append(RESULT_BALL_MESSAGE);
        }
        if (this.strikeCount != ZERO) {
            sb.append(strikeCount).append(RESULT_STRIKE_MESSAGE);
        }
        sb.append("\n");
        return sb.toString();
    }
}
