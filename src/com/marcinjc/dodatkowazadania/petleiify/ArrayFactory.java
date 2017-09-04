package com.marcinjc.dodatkowazadania.petleiify;

public class ArrayFactory {
    int dimension;

    public ArrayFactory(int dimension){
        this.dimension = dimension;
    }

    public int[] oneDimension(){
        if (dimension >= 0) {
            return new int[dimension];
        } else {
            return new int[(dimension*(-1))+1];
        }
    }

    public int[][] twoDimension(){
        if (dimension >= 0) {
            return new int[dimension][dimension];
        } else {
            return new int[(dimension*(-1))+1][(dimension*(-1))+1];
        }
    }

    public int[][] identityMatrix(){
        int[][] matrix;

        if (dimension >= 0) {
            matrix = new int[dimension][dimension];
        } else {
            matrix = new int[(dimension*(-1))+1][(dimension*(-1))+1];
        }

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
        }

        return matrix;
    }
}
