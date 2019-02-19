package testAndPractice;

/*
Given a 2D matrix that contains integers only, which each row is sorted in an ascending order. The first element of next row is larger than (or equal to) the last element of previous row.

Given a target number, returning the position that the target locates within the matrix. If the target number does not exist in the matrix, return {-1, -1}.

Assumptions:

The given matrix is not null, and has size of N * M, where N >= 0 and M >= 0.
Examples:

matrix = { {1, 2, 3}, {4, 5, 7}, {8, 9, 10} }

target = 7, return {1, 2}

target = 6, return {-1, -1} to represent the target number does not exist in the matrix.
 */
public class FindInMatrix1 {
    public int[] search(int[][] matrix, int target) {
        //.length是instance variable（成员变量）。可以被object运用的就是成员变量。与成员变量相对的是本地变量 只能在当前方法里面使用。
        //不用检查matrix[0] == null 因为 matrix.length不是0的话 第一行肯定不是null
        //如果要设置变量int col = matrix[0].length 就要检查一下matrix[0].length是否为0
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return new int[]{-1,-1};
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0;
        int right = row * col - 1;
        while(left <= right) {
            int mid = left + (right - left)/2;
            int r = mid / col;
            int c = mid % col;
            if (matrix[r][c] == target) return new int[]{r,c};
            else if (matrix[r][c] < target) left = mid + 1;
            else right = mid - 1;
        }
        return new int[]{-1,-1};
    }

}
