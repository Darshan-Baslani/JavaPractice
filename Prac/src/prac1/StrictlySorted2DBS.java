package prac1;

public class StrictlySorted2DBS {
    public static void main(String[] args) {
        int[][] data = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int target = 15;
        int[] ans = BinarySearch2D(data,target);
        for(int ele:ans){
            System.out.println(ele);
        }
    }
    static int[] BinarySearch2D(int[][] data, int target){
        int row = 0;
        int col = data.length - 1;
        while(row <= data.length-1 && col >= 0){
            if(data[row][col] > target){
                col--;
            } else if (data[row][col] < target) {
                row++;
            }else{
                return new int[] {row,col};
            }
        }
        return new int[] {-1,-1};
    }
}
