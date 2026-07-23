import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int positivecount=0;
        int negativecount=0;
        int zerocount=0;
        for (int i = 0; i < n; i++) 
        {
            if(arr[i]>0)
            {
                positivecount++;
            }
            else if(arr[i]<0)
            {
                negativecount++;
            }
            else
            {
                zerocount++;
            }
            
        }
         
        System.out.println("number of postive elements:"+positivecount);
        System.out.println("number of negative elements:"+negativecount);
           System.out.println("number of zero elements:"+zerocount);
    }
}
