package class1;

// 稳定
// 与数据状况有关

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int index = i;
            while(index > 0 && arr[index] < arr[index - 1]){
                swap(arr, index - 1, index);
                index--;
            }     
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 1, 5, 1 };
        insertionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
