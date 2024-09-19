package matrix_hw;

public class App
{
    public static void main(String[] args)
    {
        int[][] matrixA = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] matrixB = {
                { 9, 8, 7 },
                { 6, 5, 4 },
                { 3, 2, 1 }
        };

        Matrix m1 = new Matrix(matrixA);
        Matrix m2 = new Matrix(matrixB);
        int[][] m_res = m1.Multiply(m2);

        printMatrices(matrixA, matrixB, m_res);
    }

    public static void printMatrices(int[][] matrixA, int[][] matrixB, int[][] result) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                System.out.print(matrixA[i][j] + " ");
            }

            if (i == rowsA / 2) {
                System.out.print(" X  ");
            } else {
                System.out.print("    ");
            }

            for (int j = 0; j < colsB; j++) {
                System.out.print(matrixB[i][j] + " ");
            }

            if (i == rowsA / 2) {
                System.out.print(" =  ");
            } else {
                System.out.print("    ");
            }

            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }
    }
}
