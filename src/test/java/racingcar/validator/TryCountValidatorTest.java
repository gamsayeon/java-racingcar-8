package racingcar.validator;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TryCountValidatorTest {
    @Test
    void 시도횟수_음수입력시_예외발생() {
        assertThrows(IllegalArgumentException.class,
                () -> TryCountValidator.validate("-1"));
    }

    @Test
    void 시도횟수_0입력시_예외발생() {
        assertThrows(IllegalArgumentException.class,
                () -> TryCountValidator.validate("0"));
    }

    @Test
    void 시도횟수_문자열입력시_예외발생(){
        assertThrows(IllegalArgumentException.class,
                () -> TryCountValidator.validate("abc"));
    }

    @Test
    void 시도횟수_소수입력시_예외발생(){
        assertThrows(IllegalArgumentException.class,
                () -> TryCountValidator.validate("0.1"));
    }

    @Test
    void 시도횟수_공백입력시_예외발생(){
        assertThrows(IllegalArgumentException.class,
                () -> TryCountValidator.validate(""));
    }
}
