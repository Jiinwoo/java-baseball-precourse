package baseball.domain;

import java.util.List;

public class Computer {

    private BaseballList baseballList;

    public void initBallList() {
        this.baseballList = BaseballList.createBaseBallList();
    }
}
