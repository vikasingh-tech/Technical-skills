import java.util.Scanner;

public class  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of characters: ");
        int n = sc.nextInt();

        char[] arr = new char[n];

        // Insert characters
        System.out.println("Enter characters:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }

        // Character to search
        System.out.print("Enter character to search: ");
        char key = sc.next().charAt(0);

        // Linear Search
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Character found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Character not found");
        }

        sc.close();
    }
}

