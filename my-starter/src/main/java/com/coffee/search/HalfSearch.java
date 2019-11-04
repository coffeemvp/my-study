package com.coffee.search;

/**
 * @author zhang.hp
 * @date 2019/10/8.
 */
public class HalfSearch {
    public static void main(String[] args) {
        int[] array = {3,4,5, 7, 8, 10, 13, 17,19,20,25};
        int search = 7;
        int index = search(array,search);
        System.out.println(index);
    }

    private static int search(int[] array, int search) {
        int start = 0;
        int end = array.length - 1;
        if(search < array[start] || search > array[end] || start > end){
            return -1;
        }
        while (start <= end){
            int middle = (start + end)/2;
            if(array[middle] > search){
                end = middle - 1;
            }else if(array[middle] < search){
                start = middle + 1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
