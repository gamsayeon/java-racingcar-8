package racingcar;

import java.util.List;
import racingcar.domain.Car;

public class RacingPrinter {
    public static void printPositions(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
        }
        System.out.println();
    }
}
