package com.shf.sort;

import com.shf.sort.utils.Print;
import com.shf.sort.utils.Swap;

/**
 * 冒泡排序 基本不用，太慢
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {9, 3, 1, 4, 6, 8, 7, 5, 2};
        sort(a);
        Print.print(a);
    }

    static void sort(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j] > a[j + 1]) {
                    Swap.swap(a, j, j + 1);
                }
            }

        }
    }

}
