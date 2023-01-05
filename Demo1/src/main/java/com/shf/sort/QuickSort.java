package com.shf.sort;

import com.shf.sort.utils.Print;
import com.shf.sort.utils.Swap;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 8, 1, 9, 5, 4, 6};
        sort(arr, 0, arr.length - 1);
        Print.print(arr);
    }

    public static void sort(int[] arr,int leftBound,int rightBound) {
        if (leftBound >= rightBound) {
            return;
        }
        int mid = partition(arr, leftBound, rightBound);
        partition(arr, leftBound, mid-1);
        partition(arr, mid+1, rightBound);
    }

    static int partition(int[] arr, int leftBound, int rightBound) {
        int pivot = arr[rightBound];
        int left = leftBound;
        int right = rightBound - 1;

        while (left <= right) {
            while (left <= right&&arr[left]<=pivot) {
                left++;
            }
            while (left <= right&&arr[right]>pivot) {
                right--;
            }
            if (left < right) {
                Swap.swap(arr, left, right);
            }
        }

        Swap.swap(arr, left, rightBound);
        return left;
    }
}
