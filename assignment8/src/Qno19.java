// 19. Write a Java program to add two matrices of the same size.

public class Qno19 {
    public static void main(String[] args) {
        int[][] firstMatrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] secondMatrix = {
                {7, 8, 9},
                {10, 11, 12}
        };

        int[][] sum = new int[firstMatrix.length][firstMatrix[0].length];

        // Add the values at the same row and column in both matrices.
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        System.out.println("Sum of the matrices:");
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(); // Start a new line after each row.
        }
    }
}
