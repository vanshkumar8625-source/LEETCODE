class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] arr = new int[rows * cols];
        int l = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[l++] = matrix[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[k - 1];
    }
}