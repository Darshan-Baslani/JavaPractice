public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] data = {{10,20,30,40},
                        {15,25,35,45},
                        {28,29,37,49},
                        {33,34,38,50}};

        int target = 37;
        int [] ans = BinarySearch2D(data,target);

        for(int ele:ans){
            System.out.println(ele);
    static int[] BinarySearch2D(int[][] data, int target){
            int row = 0, col = data[0].length-1;
            while(row <= col) {
                if(data[row][col] > target) {
                    col--;
                }else if(data[row][col] < target){
                    row++;
                }else{
                    return new int[] {row, col};
                }
            }
            return new int[] {-1,-1};
    }
}
