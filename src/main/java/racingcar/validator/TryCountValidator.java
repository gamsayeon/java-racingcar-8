package racingcar.validator;

public class TryCountValidator {
    public static void validate(Integer tryCount){
        if(tryCount <= 0) throw new IllegalArgumentException("시도 횟수는 양수여야 합니다.");
    }
}
