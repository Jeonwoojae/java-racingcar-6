package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.model.Car;

public class RaceService {

    public static final int START_INCLUSIVE = 0;
    public static final int END_INCLUSIVE = 9;

    public List<Car> getWinner(List<Car> cars) {
        int highestLocation = cars.stream().mapToInt(Car::getLocation).max().getAsInt();
        return cars.stream().filter(car -> car.getLocation() == highestLocation).collect(Collectors.toList());
    }

    public void runRace(List<Car> cars) {
        for (Car car : cars) {
            int randomNumber = Randoms.pickNumberInRange(START_INCLUSIVE, END_INCLUSIVE);
            car.goOrStop(randomNumber);
        }
    }

    public void runRaceWithIteration(List<Car> cars, int iteration) {
        for (int i = 0; i < iteration; i++) {
            runRace(cars);
        }
    }
}
