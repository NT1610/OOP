public class Test {
    public static void main(String[] args) {
        int row = 0;
        int col = 0;
        int[][] matrix1 = Matrix.createRandomMatrix(row, col);
        int[][] matrix2 = new int[col][row];
        Matrix.createRandomMatrix(matrix2);
        Matrix.print(matrix1);
        Matrix.print(matrix2);
        Matrix.print(Matrix.add(matrix1, matrix2));
        Matrix.print(Matrix.subtract(matrix1, matrix2));
        System.out.println(Matrix.haveSameDimension(matrix1, matrix2));
    }
}
