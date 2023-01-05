package com.shf.sort;

import com.shf.sort.utils.Print;
import com.shf.sort.utils.Swap;

/**
 * 插入排序  样本小且基本有序的时候效率比较高
 *
 * 斗地主
 *
 * 从第二个数开始往前遍历，如果小就交换
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {9, 3, 1, 4, 6, 8, 7, 5, 2};
        sort(a);
        Print.print(a);
    }

    static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    Swap.swap(a, j, j - 1);
                }
            }
        }
    }
}
