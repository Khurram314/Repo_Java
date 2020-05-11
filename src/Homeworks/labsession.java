package Homeworks;

public class labsession {
    public static void main(String[] args) {
// take each name from below array, and print like:
        //Name happy
        //Name peace
        String[] name = {"happy", "peace", "laugh", "love","grow", "learn"};
        for (int i=0; 1<name.length; i++) {
            System.out.println("Name: " + name[i]);

            String[] months = {"January", "Febraury", "March", "April" , "May", "June", "July", "August", "September", "October", "November", "December"};
            /**
             * Use below data
             * Dec, Jan, Feb: Winter
             * Mar, Apr, May: Spring
             * Jun, Jul, Aug: Summer
             * Sep, Oct, Nov: Fall
             *
             * print like, Month: January -> Season: Winter
             */


            for (String month : months) {
                String season = "";

                switch (month.toLowerCase()) {
                    case "january":
                    case "february":
                    case "december":
                        season = "Winter";
                        break;
                    case "march":
                    case "april":
                    case "may":
                        season = "Spring";
                        break;
                    case "june":
                    case "july":
                    case "august":
                        season = "Summer";
                        break;
                    case "september":
                    case "october":
                    case "november":
                        season = "Fall";
                        break;
                    default:
                        System.out.println("Invalid month name: " + season);
                }
                if (season.length() != 0) {
                    System.out.println("For " + month + ", season is: -> " + season);{
                    }
                }