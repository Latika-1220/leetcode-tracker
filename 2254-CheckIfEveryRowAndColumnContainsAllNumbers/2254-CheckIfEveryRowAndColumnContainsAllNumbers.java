// Last updated: 09/07/2026, 09:53:08
class Solution {
    public boolean checkValid(int[][] matrix) {
        int length=matrix.length;
        boolean[][] row=new boolean[length][length+1];
        boolean[][] col=new boolean[length][length+1];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int val=matrix[i][j];
                row[i][val]=true;
                col[j][val]=true;
            }
        }
        for(int i=0;i<length;i++){
            for(int j=1;j<=length;j++){
                if(!row[i][j]||!col[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}