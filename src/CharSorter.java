import java.util.*;

public class CharSorter {


    public static int getMainMenu() {

        int userChoice;
        Scanner scnr = new Scanner(System.in);


        try {
            userChoice = scnr.nextInt();
        } catch (InputMismatchException a) {
            System.out.println("Error, bad input, please enter a number 1-4");
            scnr.nextLine();
            userChoice = getMainMenu();
        }
        if (userChoice < 1 || userChoice > 4) {
            System.out.println("Error, bad input, please enter a number 1-4");
            scnr.nextLine();
            userChoice = getMainMenu();

        }

        return userChoice;
    }
    public static String charTypes (String comer){
        String statement = "";
        char[] hex = comer.toCharArray();

        int space = 0;
        int letters = 0;
        int symbols = 0;
        int numbers = 0;
        int ascii;

        for ( int x = 0; x < hex.length; x++){

            ascii = (int) (hex[x]);

            if (ascii >= 48 && ascii <= 57 ){

                numbers = numbers +1;

            }

            else if ((ascii >= 65 && ascii <= 90)  || (ascii >= 97 && ascii <= 122)){

                letters = letters +1;

            }
            else if ( ascii == 32){

                space  = space + 1;
            }
            else

                symbols = symbols +1;

        }
        statement = "Textual Character count: " + letters + "\nNumerical Character Count: " + numbers +"\nWhitespace Character count: " + space + "\nSymbol Character Count: " +symbols + "\n" ;



        return statement;
    }
    public static String alphabeticalSort(String comer){





        
    }


    public static void main(String [] args ){

        String userInput:
        Scanner scnr = new Scanner(System.in);

        boolean x = true;

        System.out.println("Welcome to Character Sorter Program\nPlease input a string to be sorted");
        userInput = scnr.nextLine();

        while(x){
            switch
        }



    }

}
