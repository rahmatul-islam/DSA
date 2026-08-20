import java.util.Arrays;

public class BS_2D {

    public static void main(String[] args) {
        int[][] matrix = {
            {1,  4,  7,  11},
            {2,  5,  8,  12},
            {3,  6,  9,  16},
            {10, 11, 13, 17}
        };
        int target =6 ;

        int[] result = search(matrix, target);
        System.out.println(Arrays.toString(result));
    }

   
     
    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1; // top-right corner থেকে শুরু

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            } else if (matrix[row][col] > target) {
                col--; // target ছোট → বামের দিকে যাও
            } else {
                row++; // target বড় → নিচের দিকে যাও
            }
        }
        return new int[]{-1, -1}; // target matrix-এ নেই
    }
}

