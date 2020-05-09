package Homeworks;

public class Homework1 {
    public static void main(String[] args) {

        /**
         * Store your first name in a variable, and display the following:
         *     1. Display length of the first name.
         *     2. Does your name starts with "K" (Considering cases)
         *     3. First alphabet of your name
         *     4. Does your name ends with "M" (Ignoring cases)
         */
        String fname = "Happy";
        System.out.println("Length of " + fname + " is : " + fname.length());
        System.out.println("Does " + fname + " start with 'K': " + fname.startsWith("K"));
        System.out.println("First letter of " + fname + " is: " + fname.charAt(0));
        System.out.println("Does " + fname + " ends with 'M': " + fname.toUpperCase().endsWith("M"));


        /**
         * String myStatment = "I am a good programmer";
         * Use string methods to do following tasks:
         * 	1. Fetch the last word of the sentence
         * 	2. Display the total number of words in the myStatement.
         * 	3. replace all the 'r' characters with 'f' characters.
         */
        String myStatment = "I am a good programmer";
        String[] statementArray = myStatment.split(" "); // {"I" , "am" , "a", "good" , "programmer"}
        int lastIndex = statementArray.length - 1;
        System.out.println("Last word in '" + myStatment + "' is : " + statementArray[lastIndex]);

        System.out.println(myStatment + " after replacing 'r' with 'f' : " + myStatment.replace('r', 'f'));


        /**
         * Store your first name in a string variable.
         * Calculate the length of your name, without using length() method of String class.
         */
        String firstName = "Happy";
        System.out.println(firstName + " length is : " + firstName.length());


        String[] firstNameLetters = firstName.split("");    // {"H" , "a" , "p" , "p" , "y"}
        System.out.println(firstName + " length is : " + firstNameLetters.length);
    }
}
