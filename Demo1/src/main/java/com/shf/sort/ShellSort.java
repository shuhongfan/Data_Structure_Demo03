package com.shf.sort;

import com.shf.sort.utils.Print;
import com.shf.sort.utils.Swap;

/**
 * 希尔排序  基于插入排序
 *
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {9, 6, 11, 3, 5, 12, 8, 7, 10, 15, 14, 4, 1, 13, 2};

        sort(arr);

        Print.print(arr);
    }

    /**
     * Knuth策略
     * @param arr
     */
    public static void sort(int[] arr) {
        int h = 1;
        while (h <= arr.length / 3) {
            h = h * 3 + 1;
        }

        for (int gap = h; gap > 0; gap =(gap-1)/3) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j > gap-1; j-=gap) {
                    if (arr[j] < arr[j - gap]) {
                        Swap.swap(arr, j, j - gap);
                    }
                }
            }
        }
    }

    /**
     * N/2策略
     * @param arr
     */
    public static void sort2(int[] arr) {
        for (int gap = arr.length/2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j > gap-1; j-=gap) {
                    if (arr[j] < arr[j - gap]) {
                        Swap.swap(arr, j, j - gap);
                    }
                }
            }
        }
    }
}
