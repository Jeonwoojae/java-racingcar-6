package racingcar.view;

import java.util.List;
import racingcar.model.Car;

public class OutputView {
    public static final String LOCATION_AND_NAME_DELIMITER = " : ";
    public static final String NAME_DELIMITER = ", ";
    public static final String FINAL_WINNER = "최종 우승자";

    public void displayPerRace(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.toString());
        }
        System.out.println();
    }

    public void displayResults(List<Car> cars) {
        List<String> winnersNames = cars.stream().map(Car::getName).toList();
        String winnerNamesMessage = String.join(NAME_DELIMITER, winnersNames);
        System.out.print(FINAL_WINNER + LOCATION_AND_NAME_DELIMITER + winnerNamesMessage);
    }

    public void displayStart() {
        System.out.println();
        System.out.println("실행 결과");
    }
}
