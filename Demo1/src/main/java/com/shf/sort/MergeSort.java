package com.shf.sort;

import com.shf.sort.utils.Print;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8, 3, 6, 9};
        sort(arr,0, arr.length-1);
        Print.print(arr);
    }

    static void sort(int[] arr, int left, int right) {
        if (left == right) {
            return;
        }

//        分成两半
        int mid = left + (right - left) / 2;

//        左边排序
        sort(arr, left, mid);

//        右边排序
        sort(arr, mid+1, right);

//        合并
        merge(arr, left, mid + 1, right);
    }

    /**
     *
     * @param arr   数组
     * @param leftPtr  左指针
     * @param rightPtr  右指针
     * @param rightBound  右边界
     */
    static void merge(int[] arr,int leftPtr,int rightPtr,int rightBound) {
        int mid = rightPtr - 1;
        int[] temp = new int[rightBound-leftPtr+1];

        int i = leftPtr;
        int j = rightPtr;
        int k = 0;

        while (i <= mid && j <= rightBound) {
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= rightBound) {
            temp[k++] = arr[j++];
        }

        for (int m = 0; m < temp.length; m++) {
            arr[leftPtr + m] = temp[m];
        }
    }
}
