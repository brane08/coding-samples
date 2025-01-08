package com.github.brane08.dsa.sort;

import java.util.Collections;
import java.util.List;

public interface Sortable {
    List<Integer> sort(List<Integer> unsorted);

    default List<Long> getTimes() {
        return Collections.emptyList();
    }

    default void printStats() {
        List<Long> times = getTimes();
        long min = times.stream().min(Long::compareTo).orElse(0L);
        long max = times.stream().max(Long::compareTo).orElse(0L);
        double sum = times.stream().mapToLong(Long::longValue).average().orElse(0.0);
        System.out.printf("Stats Min: %d ns, Max: %d ns, Avg: %.2f ns\n", min, max, sum);
    }
}
