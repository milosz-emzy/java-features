import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MegaStoreTest {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(12, 100, DiscountType.Standard, 94.0d),
                Arguments.of(12, 100, DiscountType.Seasonal, 88.0d),
                Arguments.of(9, 100, DiscountType.Weight, 94.0d),
                Arguments.of(10, 100, DiscountType.Weight, 94.0d),
                Arguments.of(11, 100, DiscountType.Weight, 82.0d),
                Arguments.of(12, 100, DiscountType.Weight, 82.0d)
        );
    }

    public enum DiscountType {
        Standard,
        Seasonal,
        Weight;
    }
    /*
        Standard discount 6% weight=any
        Seasonal discount 12% weight=any
        Weight <=10 discount 6% weight<=10
        Weight >10 discount 18% weight>10
        *
    * */
    public static double getDiscountedPrice(double cartWeight,
                                            double totalPrice,
                                            DiscountType discountType) {
        return switch (discountType) {
            case Standard -> totalPrice * (1.0d - 0.06d);
            case Seasonal -> totalPrice * (1.0d - 0.12d);
            case Weight -> {
                if (cartWeight <= 10) {
                    yield totalPrice * (1.0d - 0.06d);
                } else {
                    yield totalPrice * (1.0d - 0.18d);
                }
            }
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void testGetDiscountedPrice(double cartWeight, double totalPrice, DiscountType discountType, double expectedPrice) {
        Assertions.assertThat(getDiscountedPrice(cartWeight, totalPrice, discountType)).isEqualTo(expectedPrice);
    }
}
