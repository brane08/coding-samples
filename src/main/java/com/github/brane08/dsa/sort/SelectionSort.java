package com.github.brane08.dsa.sort;

import java.util.List;

public class SelectionSort implements Sortable {

    @Override
    public void sort(List<Integer> toSort) {
        int size = toSort.size();
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
    }
}
