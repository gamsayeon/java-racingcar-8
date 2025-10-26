package racingcar.validator;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CarNameValidatorTest {
    @Test
    void 이름_공백_입력시_예외발생() {
        assertThrows(IllegalArgumentException.class,
                () -> CarNameValidator.validate("po bi"));
    }

    @Test
    void 이름_5자초과_입력시_예외발생() {
        assertThrows(IllegalArgumentException.class,
                () -> CarNameValidator.validate("pobijun"));
    }

    @Test
    void 이름_중복_입력시_예외발생() {
        assertThrows(IllegalArgumentException.class,
                () -> CarNameValidator.validate("pobi,pobi"));
    }

    @Test
    void 이름_쉼표연속_입력시_예외발생() {
        assertThrows(IllegalArgumentException.class,
                () -> CarNameValidator.validate("pobi,,jun"));
    }
}
