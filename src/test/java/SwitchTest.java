import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SwitchTest {

    @ParameterizedTest
    @ValueSource(ints = {7, 10})
    public void testSwitch(int target) {
        String extracted = mapWithSwitch(target, 10);
        System.out.println("extracted: " + extracted);
    }

    private static String mapWithSwitch(int target, int cond) {
        return switch (target) {
            case 7  -> "seven";
            case 10 -> {
                System.out.println("into 10");
                yield "yielded";
            }
            default -> throw new IllegalStateException("Unexpected value: " + target);
        };
    }
}
