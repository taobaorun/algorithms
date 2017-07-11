package com.jiaxy.algorithms.sortingsearching;

import java.util.Arrays;

/**
 * Description: <br/>
 * <p/>
 * <br/>
 * <p>
 *
 * @Date: 2017/07/11 14:05
 */
public class InsertSort {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 9, 2, 9, 7, 18, 11};
        insert(arr);
        System.out.println(Arrays.toString(arr));


    }

    /**
     * [0,i - 1] 有序
     * 把[i,n -1] 元素比较插入有序区
     *
     * O(n * n)
     * @param arr
     */
    private static void insert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int e = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > e) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = e;
        }
    }
}
