package racingcar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

public class CarMoveTest {
    @Test
    void 랜덤값_4이상_이면_전진() {
        Car car = new Car("pobi");
        car.move(5); // 4 이상이므로 전진
        assertEquals(1, car.getPosition());
    }

    @Test
    void 랜덤값_4미만_이면_멈춤() {
        Car car = new Car("pobi");
        car.move(3); // 4 미만이므로 멈춤
        assertEquals(0, car.getPosition());
    }

    @Test
    void 여러_차수_전진테스트() {
        Car car = new Car("pobi");
        List<Integer> randomNumbers = List.of(1, 4, 9, 2, 7);
        for (int number : randomNumbers) {
            car.move(number);
        }
        // 4, 9, 7 -> 총 3번 전진
        assertEquals(3, car.getPosition());
    }
}
