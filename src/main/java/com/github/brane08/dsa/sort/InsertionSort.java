package com.github.brane08.dsa.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

public class InsertionSort implements Sortable {

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
            int current = i;
            while (current > 0 && toSort.get(current) < toSort.get(current - 1)) {
                int temp = toSort.get(current);
                toSort.set(current, toSort.get(current - 1));
                toSort.set(current - 1, temp);
                current--;
            }
        }
        times.add(System.nanoTime() - before);
        return toSort;
    }
}
