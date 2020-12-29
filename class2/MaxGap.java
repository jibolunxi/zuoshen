package class2;

public class MaxGap {
    public static int getMaxGap(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            min = i < min ? i : min;
            max = i > max ? i : max;
        }

        int len = arr.length;
        int[] minValue = new int[len + 1];
        int[] maxValue = new int[len + 1];
        boolean[] notNull = new boolean[len + 1];
        int index = 0;
        for (int i = 0; i < len; i++) {
            index = findIndex(min, max, arr[i], len + 1);
            // if(notNull[index]){
            //     minValue[index] = minValue[index] < arr[i] ? minValue[index] : arr[i];
            //     maxValue[index] = maxValue[index] > arr[i] ? maxValue[index] : arr[i];
            // }else{
            //     notNull[index] = true;
            //     minValue[index] = arr[i];
            //     maxValue[index] = arr[i];
            // }
            minValue[index] = notNull[index] ? Math.min(minValue[index], arr[i]) : arr[i];
            maxValue[index] = notNull[index] ? Math.max(minValue[index], arr[i]) : arr[i];
            notNull[index] = true;
        }

        int maxGap = Integer.MIN_VALUE;
        int lastMax = maxValue[0];
        for (int i = 1; i < notNull.length; i++) {
            if(notNull[i]){
                maxGap = Math.max(maxGap, minValue[i] - lastMax);
                lastMax = maxValue[i];
            }
        }

        return maxGap;
    }

    public static int findIndex(int min, int max, int value, int size) {
        int res = (int)((value - min) / ((max - min) * 1.0 / size));
        if(res == 0){
            return 0;
        }
        return res - 1;
    }

    public static void main(String[] args) {
        int res = getMaxGap(new int[]{1,2,5,1,3,9,11,19,2});
        System.out.println(res);
    }
}
