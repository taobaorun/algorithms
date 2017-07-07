package com.jiaxy.algorithms.string_array;

import java.util.Arrays;

public class RotateArray {


    public static void main(String[] args) {
        print(rotate(sourceArray(7), 3));
        print(rotateByReversal(sourceArray(7), 3));
    }


    /**
     * O(n) time
     * O(n) space
     *
     * @param src
     * @param k
     * @return
     */
    private static int[] rotate(int[] src, int k) {
        int[] rotatedArray = new int[src.length];
        if (src.length >= k) {
            System.arraycopy(src, src.length - k, rotatedArray, 0, k);
            System.arraycopy(src, 0, rotatedArray, k, src.length - k);
        }
        return rotatedArray;
    }

    /**
     * O(n) time
     * O(1) space
     *
     * @param src
     * @param k
     * @return
     */
    private static int[] rotateByReversal(int[] src, int k) {
        reverse(src, 0, src.length -1 - k);
        reverse(src, src.length - k, src.length - 1);
        reverse(src, 0, src.length - 1);
        return src;
    }

    private static void reverse(int[] src, int start, int end) {
        if (src == null || src.length == 0) {
            return;
        }
        while (start < end) {
            int tmp = src[end];
            src[end] = src[start];
            src[start] = tmp;
            start++;
            end--;
        }
    }


    private static int[] sourceArray(int n) {
        int[] src = new int[n];
        for (int i = 1; i <= n; i++) {
            src[i - 1] = i;
        }
        return src;
    }


    private static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
