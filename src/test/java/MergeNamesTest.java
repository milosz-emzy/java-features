import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeNamesTest {
    
    private String[] uniqueNames(String[] names1, String[] names2) {
        return Stream.concat(Arrays.stream(names1), Arrays.stream(names2)).distinct().toArray(String[]::new);
    }

    @Test
    void testUniqueNames() {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};

        String[] expected = {"Ava", "Emma", "Olivia", "Sophia"};

        String[] actual = uniqueNames(names1, names2);
        Assertions.assertThat(actual).containsExactly(expected);
    }
}