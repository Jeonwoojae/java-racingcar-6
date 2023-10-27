package racingcar.car;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Nested
    class 자동차_생성 {
        @Test
        void 자동차_생성_실패_null_입력() {
            assertThatThrownBy(() -> new Car(null))
                    .isInstanceOf(IllegalArgumentException.class);
        }

        @Test
        void 자동차_생성_실패_길이가_5글자보다_큰_입력() {
            assertThatThrownBy(() -> new Car("aaaaaa"))
                    .isInstanceOf(IllegalArgumentException.class);
        }

        @Test
        void 자동차_생성_실패_빈_문자열_입력() {
            assertThatThrownBy(() -> new Car(""))
                    .isInstanceOf(IllegalArgumentException.class);
        }

        @Test
        void 자동차_생성_실패_특문_숫자_입력() {
            assertThatThrownBy(()-> new Car("$#%@"))
                    .isInstanceOf(IllegalArgumentException.class);
            assertThatThrownBy(() -> new Car("1234"))
                    .isInstanceOf(IllegalArgumentException.class);
        }
    }

}
