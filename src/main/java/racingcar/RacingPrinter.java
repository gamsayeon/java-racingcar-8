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

    public static void printWinners(List<Car> cars) {
        int maxPosition = cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);

        StringBuilder winners = new StringBuilder();
        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                if (!winners.isEmpty()) {
                    winners.append(", ");
                }
                winners.append(car.getName());
            }
        }
        System.out.println("최종 우승자 : " + winners);
    }
}
