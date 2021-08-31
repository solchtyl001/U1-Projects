import java.util.Scanner;
public class MadLib {

    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String noun;
        String verb;
        String nounTwo;
        String verbTwo;


        System.out.println("Enter a noun.");
        noun = read.next();

        System.out.println("Enter a verb");
        verb = read.next();

        System.out.println("Enter a noun");
        nounTwo = read.next();

        System.out.println("Enter a verb");
        verbTwo = read.next();

        System.out.println("Once upon a time there was a little " + noun + ". The " + noun + " was very " + verb + ". Then the " + noun + " met the "
         + nounTwo + ". The " + nounTwo + " was sorta " + verbTwo + ".");
        System.out.println( "The " + noun + " and the " + nounTwo + " fell in love and lived happily ever after. The End.");








    }









}