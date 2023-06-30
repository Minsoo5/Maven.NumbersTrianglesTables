package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String evenResults = "";

        for (int i = start; i < stop; i ++) {
            if (i % 2 == 0) {
                evenResults = evenResults + i;
            }
        }

        return evenResults;
    }


    public static String getOddNumbers(int start, int stop) {
       String oddResults = "";

       for (int i = start; i < stop; i++) {
           if (i % 2 == 1) {
               oddResults = oddResults + i;
           }
       }

        return oddResults;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String squareNum = "";

        for (int i = start; i < stop ; i += step) {
            squareNum += (i*i);
        }


        return squareNum;
    }

    public static String getRange(int start) {
        String rangeAns = "";
        for (int i = 0; i < start; i++) {
            rangeAns += i;
        }

        return rangeAns;
    }

    public static String getRange(int start, int stop) {
        String rangeStuff = "";
        for (int i = start; i < stop; i++) {
            rangeStuff += i;
        }

        return rangeStuff;
    }


    public static String getRange(int start, int stop, int step) {
        String stepRange = "";

        for (int i = start; i < stop ; i += step) {

            stepRange += i;
        }


        return stepRange;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String expAns = "";

        for (int i = start; i < stop; i += step) {
            expAns += (i * i);
        }

        return expAns;
    }
}
