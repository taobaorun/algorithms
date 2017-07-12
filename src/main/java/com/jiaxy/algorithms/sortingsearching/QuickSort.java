package com.jiaxy.algorithms.sortingsearching;

import java.util.Arrays;

/**
 * Description: <br/>
 * <p/>
 * <br/>
 *
 * @Date: 2017/07/11 16:50
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 9, 2, 9, 7, 18, 11};
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        arr = new int[]{1, 9, 2, 9, 7, 18, 11};
        iterate(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quick(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quick(arr, low, pivot - 1);
            quick(arr, pivot + 1, high);
        }
    }

    /**
     * 避免了递归方式一些相关方面存储的开销
     *
     * 递归方式需要存储方法调用的相关环境信息
     *
     * @param arr
     * @param low
     * @param high
     */
    private static void iterate(int[] arr, int low, int high) {
        int[] stack = new int[high - low + 1];
        int top = -1;
        stack[++top] = low;
        stack[++top] = high;
        while (top >= 0) {
            high = stack[top--];
            low = stack[top--];
            int p = partition(arr, low, high);
            if (p - 1 > low) {
                stack[++top] = low;
                stack[++top] = p - 1;
            }
            if (p + 1 < high) {
                stack[++top] = p + 1;
                stack[++top] = high;
            }
        }
    }



    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        int tmp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = tmp;
        return i + 1;
    }


}
