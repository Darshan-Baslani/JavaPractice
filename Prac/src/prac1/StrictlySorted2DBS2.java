package prac1;

import java.util.Arrays;

public class StrictlySorted2DBS2 {
    public static void main(String[] args) {
        int[][] data = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int target = 15;
        System.out.println(Arrays.toString(BinarySearch2D(data,target)));
    }
    static int[] BinarySearch2D(int[][] data, int target){

        int rows = data.length-1;
        int cols = data[0].length-1;
        if(rows == 0){
            return BinarySearch(data, rows, cols, target);
        }
        if(rows == 1){
            int[] ans1 = BinarySearch(data, 0, cols, target);
            if(ans1[0] != -1){
                return  ans1;
            }
            return BinarySearch(data, 1, cols, target);
        }
        int rStart = 0;
        int rEnd = rows;
        int cMid = cols / 2;
        while (rStart <= rEnd-2){
            int rMid = rStart + (rEnd - rStart) / 2;
            if(data[rMid][cMid] < target){
                rStart = rMid;
            } else if (data[rMid][cMid] > target) {
                rEnd = rMid;
            }else {
                return new int[] {rStart,rEnd};
            }
        }
        int[] ans1 = BinarySearch(data, rStart, cols, target);
        if(ans1[0] != -1){
            return  ans1;
        }
        return BinarySearch(data, rStart+1, cols, target);
    }

    //Simple Binary Search
    static int[] BinarySearch(int[][]data, int row, int col, int target){
        int start = 0;
        int end = col;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(data[row][mid] < target){
                start = mid+1;
            } else if (data[row][mid] > target) {
                end = mid-1;
            }else{
                return new int[] {row,mid};
            }
        }
        return new int[] {-1,-1};
    }
}
