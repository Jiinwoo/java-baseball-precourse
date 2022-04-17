package baseball.domain;

import java.util.List;

public class Computer {

    private BaseballList baseballList;

    public void initBallList() {
        this.baseballList = BaseballList.createBaseBallList();
    }

    public Result judge (BaseballList userBaseballList) {

        int countStrike = userBaseballList.countStrike(baseballList);
        int countBall = userBaseballList.countBall(baseballList);

        return new Result(countStrike, countBall);
    }
}
