package com.ugurhicyilmam.ctci.ch1;

final class Q8 {

    private Q8() {

    }

    static void fillWithZero(int[][] matrix) {
        int rowCount = matrix.length;
        int columnCount = matrix[0].length;
        boolean[] rows = new boolean[rowCount];
        boolean[] columns = new boolean[columnCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    columns[j] = true;
                }
            }
        }

        for (int currentRow = 0; currentRow < rowCount; currentRow++) {
            if(rows[currentRow]) {
                for (int currentColumn = 0; currentColumn < columnCount; currentColumn++) {
                    matrix[currentRow][currentColumn] = 0;
                }
            }
        }

        for (int currentColumn = 0; currentColumn < columnCount; currentColumn++) {
            if(columns[currentColumn]) {
                for (int currentRow = 0; currentRow < rowCount; currentRow++) {
                    matrix[currentRow][currentColumn] = 0;
                }
            }
        }
    }
}
