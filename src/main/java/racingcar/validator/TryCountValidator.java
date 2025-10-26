package racingcar.validator;

public class TryCountValidator {
    public static void validate(String tryCountInput){
        int tryCount = 0;
        try{
            tryCount = Integer.parseInt(tryCountInput);
        }catch(NumberFormatException e){
            throw new IllegalArgumentException("시도 횟수는 정수여야 합니다.");
        }
        if(tryCount <= 0) throw new IllegalArgumentException("시도 횟수는 양수여야 합니다.");
    }

    public static Integer parseAndValidate(String tryCountInput){
        validate(tryCountInput);
        return Integer.parseInt(tryCountInput);
    }
}
