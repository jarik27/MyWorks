package recap.lecture11;

import java.util.Arrays;

public class BubbleSortEx {
    public static void main(String[] args) {
        int numberArrays[] = {6, 5, 3, 1, 8, 7, 2, 4};

        System.out.println("Array before Bubble Sort");
        System.out.println(Arrays.toString(numberArrays));
        System.out.println();

        // bubbleSort(numberArrays);

        System.out.println("Array After Bubble Sort");
        System.out.println(Arrays.toString(numberArrays));


    }

    static void bubbleSort(int[] numberArrays) {
        int totalSize = numberArrays.length;
        int temp = 0;
        for (int i = 0; i < numberArrays.length-1; i++) {
            for (int j = 0; j < (totalSize - i); j++) {
                if (numberArrays[j - 1] > numberArrays[j]) {
                    //swap elements
                    temp = numberArrays[j - 1];
                    numberArrays[j - 1] = numberArrays[j];
                    numberArrays[j] = temp;
                }
            }
        }
    }
}
