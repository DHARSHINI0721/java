import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();

        int a[] = new int[n1];

        System.out.println("Enter first array:");

        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array:");
        int n2 = sc.nextInt();

        int b[] = new int[n2];

        System.out.println("Enter second array:");

        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("Common Elements:");

        for (int i = 0; i < n1; i++) {

            for (int j = 0; j < n2; j++) {

                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }
}
