package com.github.brane08.dsa.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Queue;

class SortableTest {

    Queue<List<Integer>> toSort;

    @BeforeEach
    void setUp() {
        toSort = Loader.load("/sorts.txt");
    }

    @Test
    void testInsertionSort() {
        System.out.println("================ This is InsertionSort ================");
        Sortable sorter = new InsertionSort();
        int index = 1;
        for (List<Integer> integers : toSort) {
            List<Integer> sorted = sorter.sort(integers);
//            System.out.printf("Index: %02d, Sorted: %s\n", index++, sorted.toString());
        }
        sorter.printStats();
    }

    @Test
    void testSelectionSort() {
        System.out.println("================ This is SelectionSort ================");
        Sortable sorter = new SelectionSort();
        int index = 1;
        for (List<Integer> integers : toSort) {
            List<Integer> sorted = sorter.sort(integers);
//            System.out.printf("Index: %02d, Sorted: %s\n", index++, sorted.toString());
        }
        sorter.printStats();
    }

    @Test
    void testBubbleSort() {
        System.out.println("================ This is BubbleSort ================");
        Sortable sorter = new BubbleSort();
        int index = 1;
        for (List<Integer> integers : toSort) {
            List<Integer> sorted = sorter.sort(integers);
//            System.out.printf("Index: %02d, Sorted: %s\n", index++, sorted.toString());
        }
        sorter.printStats();
    }

    @Test
    void testMergeSort() {
        System.out.println("================ This is MergeSort ================");
        Sortable sorter = new MergeSort();
        int index = 1;
        for (List<Integer> integers : toSort) {
            List<Integer> sorted = sorter.sort(integers);
//            System.out.printf("Index: %02d, Sorted: %s\n", index++, sorted.toString());
        }
        sorter.printStats();
    }

    @Test
    void testQuickSort() {
        System.out.println("================ This is QuickSort ================");
        Sortable sorter = new QuickSort();
        int index = 1;
        for (List<Integer> integers : toSort) {
            List<Integer> sorted = sorter.sort(integers);
            System.out.printf("Index: %02d, Sorted: %s\n", index++, sorted.toString());
        }
        sorter.printStats();
    }
}