package racingcar;

import java.util.List;
import racingcar.domain.Car;

public class RacingPrinter {
    public static void printPositions(List<Car> cars) {
        StringBuilder positions = new StringBuilder();
        for (Car car : cars) {
            positions.append(car.getName())
                    .append(" : ")
                    .append("-".repeat(car.getPosition()))
                    .append("\n");
        }
        System.out.println(positions);
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
