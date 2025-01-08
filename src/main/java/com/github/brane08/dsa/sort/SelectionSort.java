package com.github.brane08.dsa.sort;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort implements Sortable {

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
        for (int i = 0; i < size; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (toSort.get(j) < toSort.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = toSort.get(minIndex);
            toSort.set(minIndex, toSort.get(i));
            toSort.set(i, temp);
        }
        times.add(System.nanoTime() - before);
        return toSort;
    }
}
