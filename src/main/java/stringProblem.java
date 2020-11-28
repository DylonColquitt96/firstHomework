public class stringProblem {
    public static void main(String[] args) {

        /*
         * smallestStringSorter()
         *
         * Given two strings, stringA and stringB, return the smallest string, however, if one of the strings has a length
         * of 0, return the other string.  If both strings are the same length, return a new string mashing stringA and
         * stringB together.
         *
         * Examples:
         * - smallestStringSorter("two", "fifteen") -> "two"
         * - smallestStringSorter("", "tomorrow") -> "tomorrow"
         * - smallestStringSorter("zizzer", "zazzer") -> "zizzerzazzer"
         */

        String stringA = "Some Body once told me, ";
        int stringALength = stringA.length();
        String stringB = "world is gonna roll me. ";
        int stringBLength = stringB.length();
        int neutral = 0;

        if (stringALength == stringBLength) {
            System.out.println(stringA + stringB);
        } else if (stringALength < stringBLength) {
            System.out.println(stringA);
        } else if (stringALength > stringBLength ) {
            System.out.println(stringB);
        } else if (stringALength == neutral || stringBLength == neutral) {
            System.out.println(stringALength < stringBLength);
        }

        /*
         * evenUpperCaseOrOddLowerCase()
         *
         * Given a string, str, transform the string's characters to upper case characters if the length is even or lower
         * case if the length is odd.
         *
         * Examples:
         * - evenUpperCaseOrOddLowerCase("Hello") -> "hello"
         * - evenUpperCaseOrOddLowerCase("Zizzer Zazzer Zuzz") -> "ZIZZER ZAZZER ZUZZ"
         */

        String toChange = "I ain't the sharpest tool in the shed ";
        int evenOdd = (toChange.length()%2);

        if (evenOdd == 0){
            System.out.println(toChange.toUpperCase());
        } else{
            System.out.println(toChange.toLowerCase());
        }



        /*
         * stringCombiner()
         *
         * Given two strings, stringA and stringB, return a new string that combines the two strings, but the strings should
         * be combined in ascending alphabetically order.
         *
         * Examples:
         * - stringCombiner("Hello", "There") -> "HelloThere"
         * - stringCombiner("Zizzer" "zazzer") -> "zazzerZizzer"
         */


        String first = "Hello";
        String second = "there";

        int compare = first.compareTo(second);

        if (compare < 0) {
            System.out.println( second + first);
        } else {
            System.out.println( first + second);
        }

        /*
         * left2()
         * Given a string, str, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length
         * will be at least 2.
         *
         * Examples:
         * - left2("Hello") → "lloHe"
         * - left2("java") → "vaja"
         * - left2("Hi") → "Hi"
         */

        String left2 = "what";



        System.out.println(left2.substring(2) + left2.substring(0,2));
        //Using .substring we can use the index of 2 to start the string at the index of 2 which is at
        //Then by calling in the second function we can use .substring 0 to say we want to start at the beginning index
        //then followed by ,2 to say to delete index 2 on back. leaving us we atwh




    }

}
