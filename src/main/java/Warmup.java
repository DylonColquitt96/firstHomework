public class Warmup {
    public static void main(String[] args) {
        /*
         * stringTimes()
         *
         * Given a string, str, and a non-negative and non-zero integer, n, return a larger string that is n copies of the original
         * string.
         *
         * Examples:
         * - stringTimes("Hi", 2) → "HiHi"
         * - stringTimes("Hi", 3) → "HiHiHi"
         * - stringTimes("Hi", 1) → "Hi"
         */

        /*
         * icyHot()
         *
         * Given two temperatures, temp1 and temp2, return true if one is less than 0 and the other is greater than 100.
         *
         * Examples:
         * - icyHot(120, -1) → true
         * - icyHot(-1, 120) → true
         * - icyHot(2, 120) → false
         */

        int tempOne = 90;
        int tempTwo = 2;

        if(tempOne < 0 || tempTwo < 0 || tempOne > 100 || tempTwo > 100) {
            System.out.println("True");
        } else{
            System.out.println("False");
        }


    }
}
