package com.shf.sort;

import com.shf.sort.utils.Print;

import java.util.Arrays;

/**
 * 计数数组
 */
public class CountSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 3, 7, 1, 1, 0, 0, 5, 6, 9, 8, 5, 7, 4, 0, 9};
        int[] result = sort(arr);
        Print.print(result);
    }

    static int[] sort(int[] arr) {
        int[] result = new int[arr.length];
        int[] count = new int[10];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        System.out.println("元素个数："+Arrays.toString(count));

//        for (int i = 0,j=0; i < count.length; i++) {
//            while (count[i]-- > 0) {
//                result[j++] = i;
//            }
//        }

        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }
        System.out.println("累加数组："+Arrays.toString(count));

        for (int i = arr.length - 1; i >= 0; i--) {
            result[--count[arr[i]]]=arr[i];
        }

        return result;
    }
}
