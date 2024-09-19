package matrix_hw;

public class Matrix
{
    private int[][] matrix;

    public Matrix(int[][] matrix)
    {
        this.matrix = matrix;
    }

    public int[][] Multiply(Matrix matrix2)
    {
        if (this.matrix[0].length != matrix2.matrix.length) {
            throw new IllegalArgumentException("Количество столбцов первой матрицы должно быть равно количеству строк второй матрицы.");
        }

        int rows = this.matrix.length;
        int cols = matrix2.matrix[0].length;
        int commonDim = matrix2.matrix.length;
        int[][] res_matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < commonDim; k++) {
                    res_matrix[i][j] += this.matrix[i][k] * matrix2.matrix[k][j];
                }
            }
        }
        return res_matrix;
    }
}
