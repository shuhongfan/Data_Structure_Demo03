package com.shf.sort;

import com.shf.Main;
import com.shf.sort.utils.Print;

import java.util.Arrays;

/**
 * 基数排序
 *
 * 本质上是一种关键字排序
 * 有低位优先和高位优先两种
 *
 * 个位排序，十位排序，百位排序
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {421, 240, 115, 532, 305, 430, 124};
        int[] result = sort(arr);
        Print.print(result);
    }

    static int[] sort(int[] arr) {
        int[] result = new int[arr.length];
        int[] count = new int[10];

        for (int i = 0; i < 3; i++) {
            int division = (int) Math.pow(10, i);
            System.out.println("division:" + division);

            for (int j = 0; j < arr.length; j++) {
                int num = arr[j] / division % 10;
                System.out.println("num: "+num);
                count[num]++;
            }
            System.out.println();
            System.out.println(Arrays.toString(count));

//            累加数组
            for (int m = 1; m < count.length; m++) {
                count[m] = count[m] + count[m - 1];
            }

            System.out.println(Arrays.toString(count));

            for (int n = arr.length - 1; n >= 0; n--) {
                int num = arr[n] / division % 10;
                result[--count[num]] = arr[n];
            }
            System.arraycopy(result, 0, arr, 0, arr.length);
            Arrays.fill(count, 0);
        }
        return result;
    }
}
