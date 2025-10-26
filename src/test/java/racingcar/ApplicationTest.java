package racingcar;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

class ApplicationTest extends NsTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    @Test
    void 기능_테스트() {
        assertRandomNumberInRangeTest(
            () -> {
                run("pobi,woni", "1");
                // System.out 출력 캡처
                String fullOutput = output();

                // "실행 결과" 이후 부분만 슬라이싱
                String positionsOutput = fullOutput.substring(fullOutput.indexOf("실행 결과"));
                positionsOutput = positionsOutput.replace("\r\n", "\n");
                String normalizedOutput = positionsOutput.replaceAll("\\s+", "");
                String expectedOutput = ("실행 결과\n"
                        + "pobi : -\n"
                        + "woni : \n\n"
                        + "최종 우승자 : pobi").replaceAll("\\s+", "");

                assertThat(normalizedOutput).contains(expectedOutput);
            },
            MOVING_FORWARD, STOP
        );
    }

    @Test
    void 예외_테스트() {
        assertSimpleTest(() ->
            assertThatThrownBy(() -> runException("pobi,javaji", "1"))
                .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
