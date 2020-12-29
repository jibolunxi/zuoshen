package class1;

// 不稳定
// 与数据状况无关

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = arr.length - 1; i > 0; i--) {
            int maxIndex = i;
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            swap(arr, maxIndex, i);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 1, 5, 1 };
        selectionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
