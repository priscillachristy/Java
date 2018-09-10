import java.util.Scanner;

public class TomJerry {

    public static void main(String[] args) {

        int input;                                //input number
        Scanner scanner=new Scanner(System.in);
        input=scanner.nextInt();                 //taking the input number

        if(input>20 && input<30) {               /*condition for input limit*/

            if(input%2==0) {                     /*condition for even numbers within the limit*/
                System.out.println("Jerry");
            }else {
                System.out.println("Tom");
            }

        }
    }
}
