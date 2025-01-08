package com.github.brane08.dsa.sort;

import java.util.List;

public class InsertionSort implements Sortable {

    @Override
    public void sort(List<Integer> toSort) {
        int size = toSort.size();
        for (int i = 0; i < size; i++) {
            int current = i;
            while (current > 0 && toSort.get(current) < toSort.get(current - 1)) {
                int temp = toSort.get(current);
                toSort.set(current, toSort.get(current - 1));
                toSort.set(current - 1, temp);
                current--;
            }
        }
    }
}
