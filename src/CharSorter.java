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
        String statement ="";
        int ascii;
        int first = 20;
        int check;

        char[] hex = comer.toCharArray();

        for( int l = 0; l < hex.length; l++){

            ascii = (int)  (hex[l]);

            if ( ascii > first) {

                first = ascii;

            }
        }

        for ( int a = 20; a <= first ; a++){

            for ( int b = 0; b < hex.length; b++){

                boolean calc = true;
                int cal = 0;
                ascii = (int) hex[b];

            for ( int z = b - 1; b >= 0; b--){
                if (hex[z] == ascii)
                    calc = false;

            if (ascii == a && calc){

                for (int n = b; n < hex.length; n++ ){
                    check = (int) (hex[n]);

                    if ( check ==  ascii) {
                        cal =  cal + 1;
                    }
                }
                statement = statement + hex[b] + " freq: " + cal + "\n";
            }
            }

            }

        }
        return statement;
    }
    public static String frequencySort(String comer){

        String statement = "";

        int ascii;
        int check;
        int first = 20;
        int largest = 0;

        char[] hex = comer.toCharArray();

        for (int n = 0; n < hex.length; n++){

            ascii = (int) (hex[n]);

            if ( ascii > first )
                first = ascii;
        }

        for ( int q = 0 ; q < hex.length; q++) {

            ascii = (int) (hex[q]);

            int cal = 0;

            for (int n = q ; n < hex.length; n++){


                check = (int) (hex[n]);

                if ( ascii == check)

                    cal++;

                if ( cal > largest )

                    largest = cal ;
            }
        }

        for ( int k = 1;  k <= largest; k++){

            for ( int  h = first ; h >= 20; h--) {

                for ( int v =0; v < hex.length; ++v){

                    int cal  = 0;

                    boolean calc = true;

                    ascii  = (int) (hex[v]);


                    for ( int j  = v - 1; j >= 0; j--)

                        if ( hex[j]== ascii )

                            calc = false;


                    for ( int t = v ; v < hex.length; v++) {

                        check = (int) (hex[t]);

                        if ( check == ascii && calc) {
                            cal = cal + 1;
                        }
                    }
                    if ( cal == k &&  ascii == h ) {
                        statement = hex[v] + " freq:  " + cal  + "\n" + statement;
                    }
                }
            }
        }

        return statement;
    }


    public static void main(String [] args ){

        String userInput;
        Scanner scnr = new Scanner(System.in);

        boolean x = true;

        System.out.println("Welcome to Character Sorter Program\nPlease input a string to be sorted");
        userInput = scnr.nextLine();

        while(x){
            switch 
        }



    }

}
