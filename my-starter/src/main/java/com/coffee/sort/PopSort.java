package com.coffee.sort;

/**
 * @author zhang.hp
 * @date 2019/10/8.
 */
public class PopSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 8, 6, 10};
        for (int i = 1; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

}
