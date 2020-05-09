package String_HW;

public class StringQuestions {

    public static void main(String[] args) {

        String cityName = "New york city";
        String state = "New York";

        String myDetails = cityName + " " + state;

        System.out.println("My Details are : " + myDetails);

        // length
        int cityNameLength = cityName.length();
        System.out.println("Length of '" + cityName + "' is: " + cityNameLength); // Length of 'New york city' is : 13

        //tolowercase
        String lowercaseCityName = cityName.toLowerCase();
        System.out.println("Lowercase case cityname : " + lowercaseCityName);
        System.out.println("City name : " + cityName);

        //touppercase
        String uppercaseCityName = cityName.toUpperCase();
        System.out.println("City name in uppercase: " + uppercaseCityName);
        System.out.println("City name : " + cityName);

        //for comparison (equals or equalsIgnoreCase)
        boolean isEqual = lowercaseCityName.equals(uppercaseCityName);
        System.out.println("Equals result : " + isEqual);
        boolean isEqualsIgnoreCase = lowercaseCityName.equalsIgnoreCase(uppercaseCityName);
        System.out.println("Equals Ignore result : " + isEqualsIgnoreCase);

        // String cityName = "New york city";
        // to find if sequence is in the string.
        boolean isContainUSA = cityName.contains("usa");
        System.out.println("Does " + cityName + " contains 'USA': " + isContainUSA);

        boolean isContainNew = cityName.contains("new");
        System.out.println("Does " + cityName + " contains 'new': " + isContainNew);

        /**
         * verify if cityname contains 'new'
         * Note: ignore cases
         */
        String allLowerCityName = cityName.toLowerCase();
        boolean newIgnoringCases = allLowerCityName.contains("new");
        // OR
        boolean newIgnoringCases_2 = cityName.toLowerCase().contains("new");

        boolean randomContains = cityName.contains("rk ci");
        //replace
        String afterReplace = cityName.replace('c', 'C');
        System.out.println("After replace: " + afterReplace);
        System.out.println("Original Value: " + cityName);

        /**
         * sout(cityName) //New york city
         * do some replace operation without creating new variable
         * sout(cityName) //New york City
         *
         */

        System.out.println("City name : " + cityName); // New york city
        cityName = cityName.replace('c', 'C');
        System.out.println("City name : " + cityName); // New york City

        String AfterStringReplace = cityName.replace("k Cit", "ker");
        System.out.println("City name : " + cityName); // New york City
        System.out.println("After replace : " + AfterStringReplace); // New york City

        /**
         *      "new york city" // length = 13
         *      index starts with 0
         *      n -> index-0
         *      e -> index-1
         *      w -> index-2
         *        -> index-3
         *      y -> index-4
         *      ..
         *      ..
         *      t -> index-11
         *      y -> index-12
         *
         *      lastIndex = length-1
         */
        // charAt
        char charAtIndex4 = cityName.charAt(1);
        System.out.println("Char at index 4: " + charAtIndex4);

        /**
         * String var = "hello how are you? I am good.";
         *
         * char charAtLastIndex = var.charAt()
         *
         * print the last index value.
         *
         */

        String var = "hello how are you? I am good.";
        int varLength = var.length();
        char charAtLastIndex = var.charAt(varLength - 1);
        System.out.println("char at last index : " + charAtLastIndex);
        // OR
        char charAtLastIndex_1 = var.charAt(var.length() - 1);
        System.out.println("char at last index : " + charAtLastIndex_1);
        // OR
        System.out.println("char at last index : " + var.charAt(var.length() - 1));
    }
}