package racingcar.validator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarNameValidator {
    public static void validate(String carInput) {
        if (carInput.contains(",,")) {
            throw new IllegalArgumentException("쉼표가 연속될 수 없습니다.");
        }

        List<String> carNameList = Arrays.stream(carInput.split(",")).toList();
        Set<String> nameSet = new HashSet<>();

        for(String carName : carNameList){
            if(carName.isBlank()) throw new IllegalArgumentException("자동차 이름이 비어있습니다.");
            if(carName.contains(" ")) throw new IllegalArgumentException("자동차 이름에 공백이 있습니다.");
            if(carName.length()>5) throw new IllegalArgumentException("자동차 이름 5자 초과");
            if(!nameSet.add(carName)) throw new IllegalArgumentException("자동차 이름 중복");
        }
    }
}
