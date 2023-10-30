package racingcar.model.car;

import static racingcar.model.car.CarName.NAME_DUPLICATED;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Cars {

    private final List<Car> cars;

    private Cars(final List<Car> cars) {
        validateIfCarNotDuplicated(cars);
        this.cars = cars;
    }

    public static Cars from(final List<Car> cars) {
        return new Cars(cars);
    }

    private void validateIfCarNotDuplicated(final List<Car> cars) {
        Set<Car> carSet = Set.copyOf(cars);
        if (cars.size() != carSet.size()) {
            throw new IllegalArgumentException(NAME_DUPLICATED);
        }
    }

    public void run() {
        cars.forEach(Car::goOrStop);
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Cars other
                && cars.equals(other.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }
}
