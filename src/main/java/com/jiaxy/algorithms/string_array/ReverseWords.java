package com.jiaxy.algorithms.string_array;

/**
 * Title: <br>
 * <p>
 * Description: <br>
 * <p>
 * </p>
 * <br>
 *
 * @since 2017/7/8 23:41
 */
public class ReverseWords {

    public static void main(String[] args) {
        String wordsString = "Hello 2017 Java World";
        char[] words = wordsString.toCharArray();
        reverseWords(words);
        System.out.println(new String(words));



    }

    public static void reverseWords(char[] words) {
        int i = 0;
        for (int j = 0; j < words.length; j++) {
            if (words[j] == ' ') {
                reverse(words, i, j - 1);
                System.out.println(new String(words));
                i = j + 1;
            }
        }

        reverse(words, i, words.length - 1);
        System.out.println(new String(words));
        reverse(words, 0, words.length - 1);

    }

    public static void reverse(char[] s, int i, int j) {
        while (i < j) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
    }
}
