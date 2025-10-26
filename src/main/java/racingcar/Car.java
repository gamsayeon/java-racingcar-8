package racingcar;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move(int randomNumber) {
        // TODO: 구현 필요
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
