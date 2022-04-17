package baseball.domain;

import java.util.Objects;

public class Baseball {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;

    private final int baseball;

    public Baseball(int baseball) {
        isValid(baseball);
        this.baseball = baseball;
    }

    private void isValid(int baseball) {
        if (baseball < MIN_NUMBER || baseball > MAX_NUMBER) {
            throw new IllegalArgumentException("잘못된 값을 입력하였습니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Baseball baseball1 = (Baseball) o;
        return baseball == baseball1.baseball;
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseball);
    }
}
