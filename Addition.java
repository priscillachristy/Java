import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;             //Addition of the number
        String input;            //input number

        do {
            System.out.println("Enter Num");
            input = scanner.next();
            if (input.matches("\\d+")) {                     /*checking for digits*/
                try {
                    sum += Integer.parseInt(input);
                } catch (Exception ignored) {
                }
            }
        } while (!input.equals("="));        /*condition for the loop*/

        System.out.println(sum);
    }
}
