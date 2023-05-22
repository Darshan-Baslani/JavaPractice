package prac1;
//leetcode - 33 - medium
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInRoatedArrayBS {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int peak = peak_element(nums);
        if(nums[peak] == target) {
            return peak;
        }
        if(nums[0] <= target) {
            return find(nums,target,0,peak);
        }else{
            return find(nums,target,peak+1,nums.length-1);
        }
    }
    public static int peak_element(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end) {
            int mid = start + (end-start) / 2;
            if(mid < end && nums[mid] > nums[mid+1]) {
                return mid;
            }else if(mid > start && nums[mid] < nums[mid-1]) {
                return mid-1;
            }else if(nums[start] <= nums[mid]) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return nums.length-1;
    }
    public static int find(int[] nums, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] > target) {
                end = mid-1;
            } else if (nums[mid] < target) {
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
