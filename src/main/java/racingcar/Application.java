package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import racingcar.domain.Car;
import racingcar.validator.CarNameValidator;
import racingcar.validator.TryCountValidator;

public class Application {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carInput = Console.readLine();
        List<Car> carNameList = CarNameValidator.parseAndValidate(carInput);

        System.out.println("시도할 횟수는 몇 회인가요?");
        String tryCountInput = Console.readLine();
        int tryCount = TryCountValidator.parseAndValidate(tryCountInput);

        System.out.println("실행 결과");
        for (int count = 0; count < tryCount; count++) {
            for (Car car : carNameList) {
                int randomNumber = Randoms.pickNumberInRange(0, 9);
                car.move(randomNumber);
            }
            RacingPrinter.printPositions(carNameList);
        }
        RacingPrinter.printWinners(carNameList);
    }
}
