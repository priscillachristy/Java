import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[ ] arg) {
        String input;                                                                  /*input string*/
        Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();

            for (int j=0;j<input.length();j++) {
                char letters = input.charAt(j);                                       //determines the positioned characters
                if(letters=='A' || letters == 'E' || letters=='I' || letters=='O' || letters=='U' || letters=='a' || letters=='e' || letters=='i' || letters=='o' || letters=='u')
                    System.out.println("Vowel");
                else if((letters>='a' && letters<='z') || (letters>='A' && letters<='Z'))      //condition for a consonant
                    System.out.println("consonant");
                else
                    System.out.println("not an alphabet");
            }
    }
}
