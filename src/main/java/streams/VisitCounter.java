package streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class VisitCounter {
    Map<Long, Long> count(Map<String, UserStats>... visits) {
        Map<Long, Long> resultCount = new HashMap<>();
        if (visits != null) {

            resultCount = Arrays.stream(visits)
                    .filter(Objects::nonNull)
                    .flatMap(map -> getUserCountMap(map).entrySet().stream())
                    .collect(Collectors.toMap(Map.Entry::getKey,
                            Map.Entry::getValue,
                            Long::sum));

        }
        return resultCount;
    }


    public Map<Long,Long>  getUserCountMap(Map<String, UserStats> map) {
        Map<Long,Long> countMap = new HashMap<>();

        map.forEach((key,userStats)->{
                    try {
                        Long userId = Long.valueOf(key);
                        userStats.getVisitCount()
                                .ifPresent(visit -> countMap.put(userId, (countMap.getOrDefault(userId, 0L) + visit)));
                    } catch (Exception ignored) {
                    }
                }
        );
        return countMap;
    }
}
