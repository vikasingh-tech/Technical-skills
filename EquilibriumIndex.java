import java.util.Scanner;

public class EquilibriumIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            int leftSum = (i == 0) ? 0 : prefix[i - 1];
            int rightSum = prefix[n - 1] - prefix[i];

            if (leftSum == rightSum) {
                System.out.println(i);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("-1");
        }
    }
}
