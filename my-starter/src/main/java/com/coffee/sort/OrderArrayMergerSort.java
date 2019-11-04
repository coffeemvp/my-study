package com.coffee.sort;

import java.util.Arrays;

/**
 * @author zhang.hp
 * @date 2019/10/8.
 */
public class OrderArrayMergerSort {
    public static void main(String[] args) {
        int[] arr_a = {1, 2, 3, 4, 6, 9};
        int[] arr_b = {5, 7, 8, 10, 13, 20};
        int[] arr_megre = mergeArray(arr_a, arr_b);
        System.out.println(Arrays.toString(arr_megre));
    }

    private static int[] mergeArray(int[] arr_a, int[] arr_b) {
        int length_a = arr_a.length;
        int length_b = arr_b.length;
        int[] array = new int[length_a + length_b];
        int i=0,j=0,k = 0;
        while (i<length_a && j<length_b){
            if(arr_a[i] > arr_b[j]){
                array[k++] = arr_b[j++];
            }else{
                array[k++] = arr_a[i++];
            }
        }
        while (j<arr_b.length){
            array[k++] = arr_b[j++];
        }
        while (i<arr_a.length){
            array[k++] = arr_a[i++];
        }

        return array;
    }

}
