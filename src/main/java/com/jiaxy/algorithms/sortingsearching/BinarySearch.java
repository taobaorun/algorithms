package com.jiaxy.algorithms.sortingsearching;

/**
 * Description: <br/>
 * <p/>
 * <br/>
 *
 * @Date: 2017/07/11 11:10
 */
public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 3, 4, 5, 6};
        System.out.println(recurse(arr, 3, 0, arr.length - 1));
        System.out.println(iterate(arr, 3));
    }


    private static int recurse(int[] arr, int f, int l, int r) {
        int m = l + (r - l) / 2;
        if (arr[m] == f) {
            return m;
        } else if (arr[m] < f) {
            return recurse(arr, f, m + 1, r);
        } else {
            return recurse(arr, f, 1, m - 1);
        }
    }


    private static int iterate(int[] arr, int f) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == f) {
                return m;
            } else if (arr[m] < f) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return 0;
    }
}
