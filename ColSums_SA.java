/*Column Sums Class (Exercise 3)
Mr. Jay
ICS4U1-02
Sarah Ali
May 2020*/

package com.company;

public class ColSums_SA {
    public static void main(String[] args) {
        int[][] data = {{3, 2, 5},
                {1, 4, 4, 8, 13},
                {9, 1, 0, 2},
                {0, 2, 6, 3, -1, -8}};

        // declare the sum
        int sum, max = data[0].length;

        for (int[] row : data) {
            if (row.length > max) {
                max = row.length;
            }
        }

        // compute the sums for each row
        for (int col = 0; col < max; col++) {
            // initialize the sum
            sum = 0;

            // compute the sum for this row
            for (int[] datum : data) {
                if (datum.length > col) {
                    sum += datum[col];
                }
            }

            // write the sum for this row
            System.out.println(sum);
        }

    }
}
