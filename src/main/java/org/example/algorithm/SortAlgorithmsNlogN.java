package org.example.algorithm;

import java.util.Arrays;

public class SortAlgorithmsNlogN {
    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    // arr pivot
    // arr1 < pivot <  arr2
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int i = partition(arr, low, high);
            quickSort(arr, low, i-1);
            quickSort(arr, i+1, high);
        }
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Set the last element as a pivot
        int right = low;  // Right pointer to looking for values smaller than pivot
        int left = low;   // Left pointer to store values smaller than pivot
        while(right < high) {
            if (arr[right] < pivot) {
                swap(arr, left, right);
                left++;
            }
            right++;
        }
        swap(arr, left, high);
        return left;
    }

    public void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }

    public void merge(int[] arr, int left, int mid, int right) {
        int[] L = Arrays.copyOfRange(arr, left, mid+1); // left <= i <= mid
        int[] R = Arrays.copyOfRange(arr, mid+1, right+1); //  mid < i <= right
        int i = 0, j=0, k = left;
        // Merge arr L and R
        while(i < L.length && j < R.length) {
            if (L[i] < R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        // Merge the remaining elements.
        while(i < L.length) {
            arr[k++] = L[i++];
        }
        while(j < R.length) {
            arr[k++] = R[j++];
        }
    }

    public static void main(String[] args) {
        SortAlgorithmsNlogN alg = new SortAlgorithmsNlogN();
        int[] arr = new int[] { 11,2,4,6,7,8,2,2,3,10,9,5};
        // alg.quickSort(arr, 0, arr.length-1);
        alg.mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}
