package class1;

public class MergeSort {
    public static void mergeSort(int[] arr, int L, int R) {
        if(R == L){
            return ;
        }
        int mid = (L + R) / 2;
        mergeSort(arr, L, mid);
        mergeSort(arr, mid + 1, R);
        merge(arr, L, mid, R);
    }

    public static void merge(int[] arr, int L, int mid, int R) {
        int[] res = new int[R - L + 1];
        int index0 = 0, index1 = L, index2 = mid + 1;
        while(index1 <= mid && index2 <= R){
            if(arr[index1] <= arr[index2]){
                res[index0++] = arr[index1++];
            }else{
                res[index0++] = arr[index2++];
            }
        }
        while(index1 <= mid){
            res[index0++] = arr[index1++];
        }
        while(index2 <= R){
            res[index0++] = arr[index2++];
        }
        for (int i = 0; i < res.length; i++) {
            arr[L + i] = res[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 1, 5, 1 };
        mergeSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
