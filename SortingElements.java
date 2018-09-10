import java.util.Scanner;

public class SortingElements {

    public static void main(String[] args) {

        int n;             //n is input
        int temp;          // temp is temporary variable
        int sum=0;         //Addition is initialised to 0
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter no. of elements you want in array:");

        n = scanner.nextInt();     //taking input

        int a[] = new int[n];  //initialising a new array

        System.out.println("Enter all the elements:");

        for (int i = 0; i < n; i++) {              /*entering the elements if an array*/

            a[i] = scanner.nextInt();

        }

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {     /*sorting the numbers*/

                if (a[i] < a[j]) {

                    temp = a[i];

                    a[i] = a[j];

                    a[j] = temp;

                }

            }

        }

        System.out.print("Sorted number in non-increasing order:");

        for (int i = 0; i < n - 1; i++) {                  /*printing the sorted numbers*/

            System.out.print(a[i]);

        }

        System.out.print(a[n - 1]);

        for(int i = 0; i < n; i++) {                       /*calculating the Addition of even numbers*/

            if (a[i] % 2 == 0) {

                sum = sum + a[i];

            }
        }

        System.out.println("\n");
        System.out.println("Sum of even Numbers : "+sum);   /*printing the Addition*/

        if(sum>15) {                                        /*condition for true*/
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }


}
