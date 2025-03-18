import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostOccurringTest {

    @Test
    void test() {
        var list = List.of("a", "a", "b", "b", "c", "ddd", "ddd", "a", "f", "e");

        var output = list.stream()
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        )
                ).entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toUnmodifiableSet());

        Assertions.assertThat(output).isEqualTo(Set.of("b", "ddd", "a"));
    }
}
