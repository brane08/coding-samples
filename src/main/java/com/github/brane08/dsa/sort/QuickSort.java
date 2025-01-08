package com.github.brane08.dsa.sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort implements Sortable {

    private final List<Long> times = new ArrayList<>();

    @Override
    public List<Long> getTimes() {
        return times;
    }

    @Override
    public List<Integer> sort(List<Integer> unsorted) {
        long before = System.nanoTime();
        quickSort(unsorted, 0, unsorted.size());
        times.add(System.nanoTime() - before);
        return unsorted;
    }

    private void quickSort(List<Integer> unsorted, int start, int end) {
        if ((end - start) <= 1) {
            return;
        }
        int startPt = start, endPt = end - 1;
        int pivot = unsorted.get(endPt);
        while (startPt < endPt) {
            while (unsorted.get(startPt) < pivot && startPt < endPt) {
                startPt++;
            }
            while (unsorted.get(endPt) >= pivot && startPt < endPt) {
                endPt--;
            }
            if (startPt != endPt) {
                int tmp = unsorted.get(startPt);
                unsorted.set(startPt, unsorted.get(endPt));
                unsorted.set(endPt, tmp);
            }
        }
        int tmp = unsorted.get(endPt);
        unsorted.set(endPt, unsorted.get(end - 1));
        unsorted.set(end - 1, tmp);
        quickSort(unsorted, start, startPt);
        quickSort(unsorted, startPt + 1, end);
    }
}
