package class2;

public class QucikSort {
    public static void quickSort(int[] arr) {
        if(arr == null || arr.length < 2){
            return ;
        }
        quickSort(arr, 0, arr.length - 1);
    }
    public static void quickSort(int[] arr, int L, int R) {
        if(L < R){
            int[] p = partition(arr, L, R);
            quickSort(arr, L, p[0] - 1);
            quickSort(arr, p[1] + 1, R);
        }
    }

    private static int[] partition(int[] arr, int L, int R) {
        int index1 = L - 1, index2 = R;
        while(L < index2) {
            if(arr[L] < arr[R]){
                swap(arr, ++index1, L++);
            }else if(arr[L] > arr[R]){
                swap(arr, --index2, L);
            }else{
                L++ ;
            }
        }
        swap(arr, index2, R);
        return new int[]{index1 + 1, index2};
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 1, 5, 1 };
        quickSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
