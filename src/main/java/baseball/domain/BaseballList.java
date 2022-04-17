package baseball.domain;


import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BaseballList {

    private static final char ZERO_CHAR = '0';
    private static final int VALID_BASEBALL_SIZE = 3;
    private final List<Baseball> baseBallList;

    private BaseballList(List<Baseball> baseBallList) {
        this.baseBallList = baseBallList;
        isValid();
    }

    public static BaseballList createBaseBallList (String input) {
        List<Baseball> inputBallList = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            int inputNumber = input.charAt(i) - ZERO_CHAR;
            inputBallList.add(new Baseball(inputNumber));
        }
        return new BaseballList(inputBallList);
    }

    public static BaseballList createBaseBallList () {
        List<Baseball> computedBallList = new ArrayList<>();
        for (Integer integer : Randoms.pickUniqueNumbersInRange(0, 9, 3)) {
            computedBallList.add(new Baseball(integer));
        }
        return new BaseballList(computedBallList);
    }

    private void isValid () {
        isValidSize();
        isDuplicated();
    }

    private void isValidSize() {
        if(this.baseBallList.size() != VALID_BASEBALL_SIZE) {
            throw new IllegalArgumentException("올바르지 않은 공 숫자입니다.");
        }
    }

    private void isDuplicated() {
        if (this.baseBallList.size() != new HashSet<>(this.baseBallList).size()) {
            throw new IllegalArgumentException("중복된 공이 발견되었습니다.");
        }
    }


    public int countStrike(BaseballList cmpBaseballList) {
        int cnt = 0;
        for (int i = 0; i < this.baseBallList.size(); i++) {
            if(this.baseBallList.get(i).equals(cmpBaseballList.baseBallList.get(i))) {
                cnt++;
            }
        }
        return cnt;
    }

    public int countBall(BaseballList cmpBaseballList) {
        int cnt = 0;
        for (int i = 0; i < this.baseBallList.size(); i++) {
            if (this.baseBallList.get(i).equals(cmpBaseballList.baseBallList.get(i))) {
                continue;
            }
            if (cmpBaseballList.contains(this.baseBallList.get(i))){
                cnt++;
            }
        }
        return cnt;
    }


    private boolean contains (Baseball cmpBaseball) {
        return this.baseBallList.contains(cmpBaseball);
    }
}
