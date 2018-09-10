import java.util.Scanner;

public class PatternPrinting {

    public static void main(String[] args) {

        int input;                                             /*size of the PatternPrinting*/
        Scanner scanner=new Scanner(System.in);
        input=scanner.nextInt();

        for (int i=1;i<=input;i++) {                          /*printing the Pattern*/
            for (int j=1;j<=i;j++) {
                System.out.println(i);
            }
        }

    }
}
