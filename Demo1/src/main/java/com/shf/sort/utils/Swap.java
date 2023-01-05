package com.shf.sort.utils;

public class Swap {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
}
