package com.github.brane08.dsa.sort;

import java.util.List;

public class MergeSort implements Sortable {

    @Override
    public void sort(List<Integer> toSort) {
        int size = toSort.size();
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
    }
}
