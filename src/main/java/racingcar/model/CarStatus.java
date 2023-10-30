package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

class CarStatus {

    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 9;
    private static final int THRESHOLD = 4;

    static boolean isGoOrStop() {
        return Randoms.pickNumberInRange(RANDOM_MIN, RANDOM_MAX) >= THRESHOLD;
    }
}
