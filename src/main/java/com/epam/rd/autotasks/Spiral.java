package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int value=1,startRow=0, startColumn=0, valueLast=rows*columns;
        int[][] spiral=new int[rows][columns];
        while (true) {
            for (int i = startColumn; i < columns; i++)
                spiral[startRow][i] = value++;
            for (int i = startRow + 1; i < rows; i++)
                spiral[i][columns - 1] = value++;
            if (value>valueLast)
                break;
            for (int i = columns - 2; i >= startColumn; i--)
                    spiral[rows - 1][i] = value++;
                for (int i = rows - 2; i > startRow; i--)
                    spiral[i][startColumn] = value++;
            startColumn++;startRow++;rows--;columns--;
        }
        return spiral;
    }
}
