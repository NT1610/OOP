import java.util.Scanner;

public class Matrix {
    public static void createRandomMatrix(int[][] matrix) {
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = (int) (Math.random() * 100);
            }
        }
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }

    public static void print(int[][] matrix) {
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void print(boolean[][] matrix) {
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                System.out.printf("%.2f%n ", matrix[row][col]);
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            return true;
        }
        return false;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            return true;
        }
        return false;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] matrixAdd = new int[matrix1.length][matrix1[0].length];
        if (haveSameDimension(matrix1, matrix2)) {
            for (int col = 0; col < matrixAdd.length; col++) {
                for (int row = 0; row < matrixAdd[0].length; row++) {
                    matrixAdd[row][col] = matrix1[row][col] + matrix2[row][col];
                }
            }
        } else {
            return null;
        }
        return matrixAdd;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        double[][] matrixAdd = new double[matrix1.length][matrix1[0].length];
        if (haveSameDimension(matrix1, matrix2)) {
            for (int col = 0; col < matrixAdd.length; col++) {
                for (int row = 0; row < matrixAdd[0].length; row++) {
                    matrixAdd[row][col] = matrix1[row][col] + matrix2[row][col];
                }
            }
        } else {
            return null;
        }
        return matrixAdd;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] matrixSub = new int[matrix1.length][matrix1[0].length];
        if (haveSameDimension(matrix1, matrix2)) {
            for (int col = 0; col < matrixSub.length; col++) {
                for (int row = 0; row < matrixSub[0].length; row++) {
                    matrixSub[row][col] = matrix1[row][col] - matrix2[row][col];
                }
            }
        } else {
            return null;
        }
        return matrixSub;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] matrixSub = new double[matrix1.length][matrix1[0].length];
        if (haveSameDimension(matrix1, matrix2)) {
            for (int col = 0; col < matrixSub.length; col++) {
                for (int row = 0; row < matrixSub[0].length; row++) {
                    matrixSub[row][col] = matrix1[row][col] - matrix2[row][col];
                }
            }
        } else {
            return null;
        }
        return matrixSub;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] matrixMul = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    matrixMul[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrixMul;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        double[][] matrixMul = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    matrixMul[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrixMul;
    }


}
