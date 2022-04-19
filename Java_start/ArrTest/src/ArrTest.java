/**
 * A program that should merge in non-decreasing order two arrays
 * that are already also sorted in non-decreasing order
 */

import java.util.Arrays;

public class ArrTest {

    public static void main(String[] args) {

        int[] a1 = new int[] {0, 2, 2};
        int[] a2 = new int[] {1, 3};

        System.out.println(Arrays.toString(mergeArrays(a1, a2)));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {

        /**
         * Merges two given sorted arrays into one
         *
         * @param a1 first sorted array
         * @param a2 second sorted array
         * @return new array containing all elements from a1 and a2, sorted
         */

        int [] result = new int[a1.length + a2.length];
        int pos1 = 0;
        int pos2 = 0;

        while(pos1 < a1.length || pos2 < a2.length) {

            result[pos1 + pos2] = (pos1 < a1.length && (pos2 == a2.length || a1[pos1] < a2[pos2]) ?
                    a1[pos1++] : a2[pos2++]);
        }

        return result;
    }
}
