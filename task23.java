import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter element:");
        int key = sc.nextInt();

        for (int i = 0; i < n; i++) {

            if (arr[i] == key) {
                System.out.println("First Occurrence = " + i);
                return;
            }
        }

        System.out.println("Element not found");
    }
}
