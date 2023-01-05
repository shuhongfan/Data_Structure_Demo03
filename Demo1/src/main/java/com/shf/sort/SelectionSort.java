package com.shf.sort;

/**
 * 选择排序  基本不用，不稳定
 *
 * 每次选择出最小的
 * 前面最先有序
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 8, 1, 7, 9, 4, 2};
        sort(arr);
        print(arr);
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;

            for (int j = i+1; j < arr.length; j++) {
//                if (arr[j] < arr[minPos]) {
//                    minPos = j;
//                }
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }

            swap(arr, i, minPos);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
