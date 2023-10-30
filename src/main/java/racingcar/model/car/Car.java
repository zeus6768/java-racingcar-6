package racingcar.model.car;

import static racingcar.model.car.CarStatus.isGo;

public class Car {

    private static final int INITIAL_DISTANCE = 0;

    private final CarName name;
    private int distance;

    private Car(final String name) {
        this.name = CarName.from(name);
        this.distance = INITIAL_DISTANCE;
    }

    public static Car from(final String name) {
        return new Car(name);
    }

    public void goOrStop() {
        if (isGo()) {
            distance++;
        }
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Car car
                && name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public CarName getCarName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}
