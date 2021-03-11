package com.company;
import java.util.ArrayList;
import java.util.Random;

public class Main {


        public static void incrementalFill(int[] arr) {
            for(int i = 0; i < 20; i++) {
                arr[i] = 55- i;
             //   System.out.print(arr[i]+" ");
            }
        }
    public static void randomFill(int[] arr) {
        Random random = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
            System.out.print(arr[i]+" r");
        }
    }
    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] < pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

    public static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j-1;
            while ( (i > -1) && ( arr[i] > key ) ) {
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }
    }


    public static void main(String[] args) {
        int[] smallArray = new int[100];
        int[] smallArray2 = new int[100];
        randomFill(smallArray);
        randomFill(smallArray2);

        System.out.println("Quick sort:");
        long time = System.nanoTime();
        quickSort(smallArray, 0, 99);
        System.out.println("Incrementally filled small array: " + (System.nanoTime() - time) + " ns");

        for(int i = 0; i < smallArray.length; i++) {
             System.out.print(smallArray[i]+" ");
        }

        System.out.println("Insertion sort:");
        long time1 = System.nanoTime();
        insertionSort(smallArray2);
        System.out.println("Incrementally filled small array: " + (System.nanoTime() - time1) + " ns");
        for(int i = 0; i < smallArray2.length; i++) {
            System.out.print(smallArray2[i]+" ");
        }
    }
}
