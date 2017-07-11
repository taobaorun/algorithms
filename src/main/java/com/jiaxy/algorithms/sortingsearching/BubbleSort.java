package com.jiaxy.algorithms.sortingsearching;

import java.util.Arrays;

/**
 * Description: <br/>
 * <p/>
 *
 * @Date: 2017/07/11 13:08
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 9, 2, 9, 7, 18, 11};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        arr = new int[]{1, 9, 2, 9, 7, 18, 11};
        bubble2(arr);
        System.out.println(Arrays.toString(arr));
    }


    /**
     * O(n^2)
     *
     * @param arr
     */
    private static void bubble(int[] arr) {
        int c = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                c++;
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(c);
    }

    private static void bubble2(int[] arr) {
        int c = 0;
        boolean swapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                c++;
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println(c);
    }
}
