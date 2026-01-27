public class max {
    public static void main(String[] args) {
        int arr[] = {-1, -2, 8, 9, 5, 6, 2};
        int max = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != max) {
                count++;
            }
        }
        System.out.println(count);
    }
}