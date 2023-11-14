package com.cxdeng.Array;

public class MergeSortedArray88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] aux = new int[m + n];

        int i = 0;
        int j = 0;

        for (int k = 0; k < m + n; k++) {

            if (i > m - 1) {
                aux[k] = nums2[j++];
            } else if (j > n - 1) {
                aux[k] = nums1[i++];
            } else if (nums1[i] <= nums2[j]) {
                aux[k] = nums1[i++];
            } else {
                aux[k] = nums2[j++];
            }
        }

        System.arraycopy(aux, 0, nums1, 0, aux.length);
    }

}
