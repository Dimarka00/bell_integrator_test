package task4;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {5, 7, 9, 2, 1},
                {0, 9, 1, 8, 7},
                {6, 3, 6, 6, 6},
                {99, 100, -2, 3, 1},
        };
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if (i == matrix.length/2) continue;
            if (matrix[i][matrix.length-i-1] < min) {
                min = matrix[i][matrix.length-i-1];
            }
        }

        System.out.println("Минимальный элемент побочной диагонали: " + min);
    }
}
