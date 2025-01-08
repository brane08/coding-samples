package com.github.brane08.dsa.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements Sortable {

    private final List<Long> times = new ArrayList<>();

    @Override
    public List<Long> getTimes() {
        return times;
    }

    @Override
    public List<Integer> sort(List<Integer> unsorted) {
        long before = System.nanoTime();
        List<Integer> sorted = mergeSort(unsorted, 0, unsorted.size());
        times.add(System.nanoTime() - before);
        return sorted;
    }

    private List<Integer> mergeSort(List<Integer> unsorted, int start, int end) {
        if ((end - start) <= 1) {
            return unsorted.subList(start, end);
        }
        int mid = (start + end) / 2;
        List<Integer> left = mergeSort(unsorted, start, mid);
        List<Integer> right = mergeSort(unsorted, mid, end);
        List<Integer> merged = new ArrayList<>();
        int leftPt = 0, rightPt = 0;
        while (leftPt < left.size() || rightPt < right.size()) {
            if (leftPt == left.size()) {
                merged.add(right.get(rightPt));
                rightPt++;
            } else if (rightPt == right.size()) {
                merged.add(left.get(leftPt));
                leftPt++;
            } else if (left.get(leftPt) <= right.get(rightPt)) {
                merged.add(left.get(leftPt));
                leftPt++;
            } else {
                merged.add(right.get(rightPt));
                rightPt++;
            }
        }
        return merged;
    }
}
