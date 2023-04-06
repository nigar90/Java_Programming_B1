package day24_office_hours;

public class MyUtil {

    /**
     This method made by Loopcamp Batch#1
     The method accepts a String and returns the reversed String
     */
    public static String reverseStr (String str) {

        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    /**
     * This method made by Loopcamp Batch#1
     * This method accepts a String parameter and puts it in a format
     * Ex:
     *      The format will be like this
     *
     *      First letter is in upper case and rest is in lower case
     *
     * Then return a String in a formatted way.
     */
    public static String fixFormat (String str) { // __feyruz__  -- F
        String fixed = str.trim();
        fixed = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        return fixed;
    }
}
