import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {7, 6, 5, 8, 3, 5, 9, 1, 6};

        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, i, arr.length);
        }
        System.out.println(Arrays.toString(arr));

    }

    static void heapify(int[] arr, int parentIndex, int length) {
        int leftIndex = parentIndex * 2 + 1;
        int rightIndex = parentIndex * 2 + 2;
        int minIndex = parentIndex;

        if (leftIndex < length && arr[leftIndex] < arr[minIndex]) {
            minIndex = leftIndex;
        }
        if (rightIndex < length && arr[rightIndex] < arr[minIndex]) {
            minIndex = rightIndex;
        }
        if (minIndex != parentIndex) {
            int temp = arr[parentIndex];
            arr[parentIndex] = arr[minIndex];
            arr[minIndex] = temp;
            heapify(arr, 0, length);
        }
    }
}
