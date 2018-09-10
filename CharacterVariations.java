import java.util.Scanner;

public class CharacterVariations {

    public static void main(String[] args) {

        char input;                                                        //input element or character
        Scanner scanner = new Scanner(System.in);
        input=scanner.next().charAt(0);

        if (input>=65 && input<=90)                                            /*condition for capital letters*/
            System.out.println("Character is a capital letter");
        else if (input>=97 && input<=122)                                      //condition for small letters
            System.out.println("Character is a small letter");
        else if (input>=48 && input<=57)                                       //condition for digits
            System.out.println("Character is a digit");
        else if ((input>0 && input<=47)||(input>=58 && input<=64)||
                (input>=91 && input<=96)||(input>=123 && input<=127))                  //condition for special characters
            System.out.println("Character is a special symbol");
    }
}
