package com.github.brane08.dsa.sort;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort implements Sortable {

    private final List<Long> times = new ArrayList<>();

    @Override
    public List<Long> getTimes() {
        return times;
    }

    @Override
    public List<Integer> sort(List<Integer> unsorted) {
        List<Integer> toSort = new ArrayList<>(unsorted);
        int size = toSort.size();
        long before = System.nanoTime();
        for (int i = size - 1; i >= 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                if (toSort.get(j) > toSort.get(j + 1)) {
                    int tmp = toSort.get(j);
                    toSort.set(j, toSort.get(j + 1));
                    toSort.set(j + 1, tmp);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        times.add(System.nanoTime() - before);
        return toSort;
    }
}
