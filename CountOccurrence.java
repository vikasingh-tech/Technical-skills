import java.util.Scanner;

public class CountOccurrence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array size input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Array elements input
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Item to count
        System.out.print("Enter element to count: ");
        int key = sc.nextInt();

        int count = 0;

        // Count occurrences
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                count++;
            }
        }

        // Output
        System.out.println("Number of occurrences of " + key + " = " + count);

        sc.close();
    }
}
