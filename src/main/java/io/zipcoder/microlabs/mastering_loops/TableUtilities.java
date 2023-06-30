package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(5);

    }

    public static String getLargeMultiplicationTable() {

        return getMultiplicationTable((10));
    }

    public static String getMultiplicationTable(int tableSize) {
        String finalTable = "";

        for(int i = 1; i <= tableSize; i ++) {
            if (i != 1) {
                finalTable += '\n';
            }
            for(int j = 1; j <= tableSize; j++) {
                if ((i * j) < 10) {
                    finalTable += ("  " + (i * j) + " |");
                } else if ((i * j ) >= 10 && (i * j) < 100) {
                    finalTable += (" " + (i * j) + " |");
                } else if ((i * j) >= 100) {
                    finalTable += ((i * j) + " |");
                }
            }
        }
        finalTable += '\n';

        return finalTable;
    }
}
