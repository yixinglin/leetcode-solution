package org.example.algorithm;

import java.util.Arrays;

public class SortAlgorithmsN2 {

    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public void bubbleSort(int[] arr) {
        System.out.println("Bubble sort");
        for (int j = arr.length-1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i+1);
                }
            }
        }
    }

    public void selectionSort(int[] arr) {
        System.out.println("Selection sort");
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    public void insertionSort(int[] arr) {
        // alg.insertionSort(arr);
        for (int i = 1; i < arr.length; i++) {
            int preIndex = i-1;
            int cur = arr[i];
            while(preIndex >= 0 && arr[preIndex] > cur) {
                arr[preIndex+1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex+1] = cur;
        }
    }

    public static void main(String[] args) {
        SortAlgorithmsN2 alg = new SortAlgorithmsN2();
        int[] arr = new int[] {11,2,4,6,7,8,2,2,3,10,9,5,1};
        // alg.bubbleSort(arr);
        // alg.selectionSort(arr);
        alg.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
