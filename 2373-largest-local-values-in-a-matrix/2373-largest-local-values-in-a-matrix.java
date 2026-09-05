class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int[][] arr=new int[n-2][n-2];
        for(int x=0;x<n-2;x++){
            for(int i=0;i<n-2;i++){
                int max=0;
                for(int j=x;j<x+3;j++){
                    for(int k=i;k<i+3;k++){
                        max=Math.max(max,grid[j][k]);
                    }
                }
                arr[x][i]=max;
            }
        }
        return arr;
    }
}