package com.github.brane08.dsa.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
            sorter.sort(integers);
            System.out.printf("Index: %02d, Sorted: %s\n", index++, integers.toString());
        }
    }

    @Test
    void testSelectionSort() {
        System.out.println("================ This is SelectionSort ================");
        Sortable sorter = new SelectionSort();
        int index = 1;
        for (List<Integer> integers : toSort) {
            sorter.sort(integers);
            System.out.printf("Index: %02d, Sorted: %s\n", index++, integers.toString());
        }
    }

    @Test
    void testBubbleSort() {
        System.out.println("================ This is BubbleSort ================");
        Sortable sorter = new BubbleSort();
        int index = 1;
        for (List<Integer> integers : toSort) {
            sorter.sort(integers);
            System.out.printf("Index: %02d, Sorted: %s\n", index++, integers.toString());
        }
    }
}