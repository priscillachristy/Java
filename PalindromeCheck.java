import java.util.Scanner;

public class PalindromeCheck {

        public static void main(String[] args) {

            String original,reverse="";                 //initialising empty original and reverse strings
            int evenSum=0;                              //initialising the sum to 0
            Scanner scanner = new Scanner(System.in);

            System.out.println("enter a number to check if it's a PalindromeCheck or not");
            original=scanner.nextLine();                //entering the input string
            int length=original.length();               //calculating the length

            for (int i=length-1;i>=0;i--)               /*reversing the string*/
                reverse = reverse + original.charAt(i);

            if (original.equals(reverse)) {             /*condition for palindrome*/

                for (int j = 0; j < original.length(); j++) {      /*calculating the evensum*/
                    if (original.charAt(j) % 2 == 0) {
                        evenSum = evenSum + original.charAt(j);
                    }
                }

                if(evenSum>25){                          /*condition for even sum greater than 25*/
                            System.out.println(original+
                                    " is a PalindromeCheck and the Addition of even numbers is greater than 25");
                } else {
                            System.out.println(original+
                                    " is a PalindromeCheck and the Addition of even numbers is less than 25");
                }
            } else
                System.out.println("it's not a PalindromeCheck");
        }

}
