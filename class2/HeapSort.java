package class2;

public class HeapSort {
    public static void heapSort(int[] arr) {
        if(arr == null || arr.length < 2){
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        for (int i = arr.length - 1; i > 0; i-- ) {
            swap(arr, i, 0);
            heapify(arr, 0, i);
        }
    }

    private static void heapInsert(int[] arr, int i) {
        while(arr[i] > arr[(i - 1) / 2]){
            swap(arr, i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    private static void heapify(int[] arr, int i, int heapSize){
        int l = i * 2 + 1;
        while(l < heapSize){
            int largest = l + 1 < heapSize && arr[l] < arr[l + 1] ? l + 1 : l;
            largest = arr[i] < arr[largest] ? largest : i;
            if(largest == i){
                break;
            }
            swap(arr, i, largest);
            i = largest;
            l = i * 2 + 1;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 1, 4, 8, 6, 6 };
        heapSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
